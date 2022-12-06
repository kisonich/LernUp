package com.example.lernupdz.lesson5;

public class Product {
    public String name;
    protected double price;
    protected double weight;
    protected int expirationDate;
    protected String category;

    public Product(String name, double price, double weight, int expirationDate) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.expirationDate = expirationDate;
        this.category = null;
    }

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.category = null;

        expirationDate = -1;
    }

}
