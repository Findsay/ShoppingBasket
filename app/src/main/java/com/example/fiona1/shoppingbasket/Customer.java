package com.example.fiona1.shoppingbasket;

/**
 * Created by Fiona1 on 22/11/2017.
 */

public class Customer {

    private Basket basket;
    private boolean loyaltyCard;

    public Customer(Basket basket, boolean loyaltyCard) {
        this.basket = basket;
        this.loyaltyCard = loyaltyCard;
    }

    public boolean hasLoyaltyCard() {
        return this.loyaltyCard;
    }

    public Basket getBasket() {
        return basket;
    }

}
