package com.example.fiona1.shoppingbasket;

import static android.R.attr.name;

/**
 * Created by Fiona1 on 22/11/2017.
 */

public enum Item {

    MILK(0.99, true ),
    BREAD(1.05, false),
    EGGS(1.65, false),
    CHEESE(2.99, false),
    COFFEE(3.20, false),
    CHICKEN(4.50, false),
    MINCE(4.50, false),
    WINE(6.99, false),
    BISCUITS(1.25, false);

    private double price;
    private boolean bogof;

    Item(double price, boolean bogof) {
        this.price = price;
        this.bogof = bogof;
    }

    public double getPrice() {
        return price;
    }

    public boolean getBOGOF() {
        return bogof;
    }
}
