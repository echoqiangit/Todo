import { Component, OnInit } from '@angular/core';
import { Model, TodoItem } from './model';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: "todo-app",
  templateUrl: "app.component.html"
})
export class AppComponent implements OnInit {
  constructor(private http: HttpClient) { }
  model = new Model();
  getName() {
    return this.model.user;
  }
  ngOnInit() {
    this.http.get("/item/").subscribe((data) => {
      console.log("get response:" + JSON.stringify(data));
      this.model.items = data;
    });

  }

  getTodoItems() {

    return this.model.items.filter(item => !item.done);
  }
  addItem(newItem) {
    
    if (newItem != "") {
      this.http.post("/item/", new TodoItem(newItem, false)).subscribe(data => {
        console.log("POST Request is successful ", data);
    },);
      this.model.items.push(new TodoItem(newItem, false));
    }
  }
}