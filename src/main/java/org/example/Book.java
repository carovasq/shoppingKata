package org.example;

public class Book extends Product implements Discountable{
    private String author;
    private String description;

    public Book(String name, double price, String author, String description) {
        super(name, price);
        this.author = author;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void applyDiscount(double discount) {

    }
}
