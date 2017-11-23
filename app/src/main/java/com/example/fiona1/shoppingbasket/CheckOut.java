package com.example.fiona1.shoppingbasket;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Fiona1 on 22/11/2017.
 */

public class CheckOut {

    private Customer customer;

    public CheckOut(Customer customer) {
        this.customer = customer;
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : customer.getBasket().getItems()){
           total += item.getPrice();
        }
        return total;
    }

    public double totalSpendDiscount(double spend) {
        if (spend > 20){
            return reduceByPercentage(spend, 10);
        }else{
            return spend;
        }
    }

    public double reduceByPercentage(double spend, int discount){
        double percentage = (1.00 - (discount/100.00));
        return spend * percentage;
    }


    public double loyaltyCardDiscount(double totalSpend) {
        if (customer.hasLoyaltyCard()){
            return reduceByPercentage(totalSpend, 2);
        }else{
            return totalSpend;
        }
    }

    public double applyBOGOFTotal() {
        ArrayList<Item> sortedItems = (customer.getBasket().getItems());
        Collections.sort(sortedItems);
        for (int i = 0; i < sortedItems.size(); i++){
            Item currentItem = sortedItems.get(i);
            if (currentItem.getBOGOF() && sortedItems.get(i + 1) == currentItem){
                customer.getBasket().remove(sortedItems.get(i + 1));
            }
        }
        return calculateTotal();

    }

    public double getFinalTotal() {
        double total1 = applyBOGOFTotal();
        double total2 = totalSpendDiscount(total1);
        double finalTotal = loyaltyCardDiscount(total2);
        return finalTotal;
    }
}

