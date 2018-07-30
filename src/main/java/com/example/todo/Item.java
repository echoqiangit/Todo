package com.example.todo;

public class Item {
    private String action;
    private boolean done;

    public Item() {
    }

    public Item(String action, boolean done) {
        this.action = action;
        this.done = done;
    }

    @Override
    public String toString() {
        return "Item{" +
                "action='" + action + '\'' +
                ", done=" + done +
                '}';
    }


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
