package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreeProductTest {
    @Test
    void elPrecioDeLosProductosGratuitosEsSiempreCero(){
        //GIVEN
        FreeProduct freeProduct = new FreeProduct("some-name");

        double productPrice = freeProduct.getPrice();

        assertEquals(0, productPrice);
    }

    @Test
    void elProductoGratuitoTieneNombreYPrecio(){
        FreeProduct freeProduct = new FreeProduct("perejil");

        String productName = freeProduct.getName();

        assertEquals("perejil", productName);
    }
}