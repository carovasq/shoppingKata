package org.example;

public class FoodProduct extends Product implements Discountable{
    private double discount;

    public FoodProduct(String name, double price) {
        super(name, price);
    }

    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        //calcular cuanto es el tanto por ciento de descuento sobre el precio
        double price = super.getPrice();
        double moneyDiscount = price * this.discount / 100;

        //total = precio - discount
        return price - moneyDiscount;
    }
}
