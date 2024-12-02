package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodProductTest {
    @Test
    void foodProductHasNameAndPrice(){
        FoodProduct foodProduct = new FoodProduct("zanahoria", 1);

        double productPrice = foodProduct.getPrice();
        String productName = foodProduct.getName();

        assertEquals(1, productPrice);
        assertEquals("zanahoria", productName);
    }

    @Test
    void whenAddDiscount_ThenPriceisDiscounted(){
        FoodProduct foodProduct = new FoodProduct("some-name", 100);

        //add discount
        foodProduct.applyDiscount(90);

        //price = price - discount(%)
        double price = foodProduct.getPrice();

        assertEquals(10, price);
    }
}
