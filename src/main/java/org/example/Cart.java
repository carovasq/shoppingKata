package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        //Comprobar si esta en la lista (Set)
        this.productList.add(product);
    }

    public List<Product> getProducts() {
        return this.productList;
    }

    public void deleteByName(String name) {
        productList.removeIf(product -> product.getName().equals(name));
    }

    public double getTotalPrice() {
        //Return suma de todos los precios
        double total = 0;

        for(Product product: productList){
            total += product.getPrice();
        }
        return total;
    }
}
