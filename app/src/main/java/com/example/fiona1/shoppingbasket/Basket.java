package com.example.fiona1.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by Fiona1 on 22/11/2017.
 */

public class Basket {

    private ArrayList<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public int getItemCount() {
        return items.size();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    public void empty() {
        items.clear();
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
