package com.example.fiona1.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Fiona1 on 22/11/2017.
 */

public class CheckOutTest {

    private CheckOut checkOut;

    @Before
    public void setUp() throws Exception {

        Basket basket = new Basket();
        basket.add(Item.MILK);
        basket.add(Item.MILK);
        basket.add(Item.BREAD);
        basket.add(Item.CHEESE);
        basket.add(Item.CHICKEN);
        basket.add(Item.COFFEE);
        basket.add(Item.EGGS);
        basket.add(Item.BISCUITS);
        basket.add(Item.WINE);
        basket.add(Item.MINCE);
        Customer customer = new Customer(basket, true);
        checkOut = new CheckOut(customer);
    }

    @Test
    public void canCalculateTotal() throws Exception {
        assertEquals(28.11, checkOut.calculateTotal(), 0.01);
    }

    @Test
    public void checkCanApplyTotalSpendDiscount() throws Exception {
        double totalSpend = checkOut.calculateTotal();
        assertEquals(25.29, checkOut.totalSpendDiscount(totalSpend), 0.01);
    }

    @Test
    public void checkCanApplyLoyaltyCardDiscount() throws Exception {
        double totalSpend = checkOut.calculateTotal();
        assertEquals(27.54, checkOut.loyaltyCardDiscount(totalSpend), 0.01);
    }

    @Test
    public void checkCanApplyBOGOF() throws Exception {
        checkOut.applyBOGOFTotal();
        assertEquals(27.12, checkOut.calculateTotal(), 0.01);

    }

    @Test
    public void canReturnCorrectTotal() throws Exception {
        assertEquals(23.91, checkOut.getFinalTotal(), 0.01);
    }
}
