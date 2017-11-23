package com.example.fiona1.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Fiona1 on 22/11/2017.
 */

public class BasketTest {

    private Basket basket;

    @Before
    public void setUp() throws Exception {
        basket = new Basket();
    }

    @Test
    public void basketStartsEmpty() throws Exception {
        assertEquals(0, basket.getItemCount());
    }

    @Test
    public void canAddItem() throws Exception {
        basket.add(Item.MILK);
        assertEquals(1, basket.getItemCount());
    }

    @Test
    public void canRemoveItem() throws Exception {
        basket.add(Item.MILK);
        basket.remove(Item.MILK);
        assertEquals(0, basket.getItemCount());
    }

    @Test
    public void canEmptyBasket() throws Exception {
        basket.add(Item.MILK);
        basket.add(Item.CHEESE);
        basket.empty();
        assertEquals(0, basket.getItemCount());
    }
}
