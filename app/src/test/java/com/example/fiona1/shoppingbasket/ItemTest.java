package com.example.fiona1.shoppingbasket;

import android.content.ClipData;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Fiona1 on 22/11/2017.
 */

public class ItemTest {

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void canGetPriceOfItem() throws Exception {
        assertEquals(1.05, Item.BREAD.getPrice(), 0.01);
    }

    @Test
    public void canGetBOGOF() throws Exception {
        assertEquals(false, Item.BREAD.getBOGOF());
    }


}
