package com.example.todo;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemControler {
    private List<Item> items;

    @PostConstruct
    public void setup() {
        items = new ArrayList<Item>();
        items.add(new Item("JavaRest Buy Flowers", false));
        items.add(new Item("JavaRest Get Shoes", false));
        items.add(new Item("JavaRest Collect Tickets", false));
        items.add(new Item("JavaRest Call Joe", false));

    }
    @GetMapping("/")
    public List<Item> getItems() {
        System.out.println("get: " + items);
        return items;
    }

    @PostMapping("/")
    public void add(@RequestBody Item item){
        System.out.println("post: " + item);
        items.add(item);
    }

}
