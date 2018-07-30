export class Model {
    user;
    items;
    constructor() {
        this.user = "Adam";
        this.items = [];
    }
}
export class TodoItem {
    action;
    done;
    constructor(action, done) {
        this.action = action;
        this.done = done;
    }
}