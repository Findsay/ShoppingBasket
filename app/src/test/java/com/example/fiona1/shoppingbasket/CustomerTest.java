package com.example.fiona1.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

/**
 * Created by Fiona1 on 22/11/2017.
 */

public class CustomerTest {

    private Basket basket;
    private Customer customer;
    private CheckOut checkOut;

    @Before
    public void setUp() throws Exception {
        basket = new Basket();
        customer = new Customer(basket, true);
        checkOut = new CheckOut(customer);
    }

    @Test
    public void canGetLoyaltyCardStatus() throws Exception {
        assertEquals(true, customer.hasLoyaltyCard());
    }

    @Test
    public void canGetBasket() throws Exception {
       assertNotNull(customer.getBasket());
    }

}
