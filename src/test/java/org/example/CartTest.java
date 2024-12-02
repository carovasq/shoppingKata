package org.example;

import org.junit.jupiter.api.MethodDescriptor;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    @Test
    void canAddAProductAndReadProductList(){
        Cart cart = new Cart();
        FoodProduct foodProduct = new FoodProduct("pizza", 10);

        //añadir el producto
        cart.addProduct(foodProduct);
//        cart.addProduct(foodProduct);


        //then: ver que el producto
        List<Product> products = cart.getProducts();

        assertEquals(1, products.size());
        assertEquals(foodProduct, products.getFirst());
    }

    @Test
    void canDeleteAProductByName(){
        //GIVEN: escenario
        Cart cart = new Cart();
        FoodProduct foodProduct = new FoodProduct("Pizza", 10);
        FreeProduct freeProduct = new FreeProduct("Perejil");

        cart.addProduct(foodProduct);
        cart.addProduct(freeProduct);

        //Eliminar la Pizza
        cart.deleteByName(foodProduct.getName());

        List<Product> products = cart.getProducts();

        assertEquals(1, products.size());
        assertEquals(freeProduct, products.getFirst());
    }

    @Test
    void canCalculateTotalPriceWithDiscounts(){
        Cart cart = new Cart();
        FoodProduct pizza = new FoodProduct("Pizza", 10);
        FoodProduct pan = new FoodProduct("Pan", 20);

        pizza.applyDiscount(10);

        cart.addProduct(pizza);
        cart.addProduct(pan);

        //Usar una ft que me de el total del Cart
        double totalPrice = cart.getTotalPrice();

        assertEquals(29, totalPrice);
    }
}
