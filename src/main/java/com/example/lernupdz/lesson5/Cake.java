package com.example.lernupdz.lesson5;

public class Cake extends Product{
    public Cake(String name, double price, double weight, int expirationDate) {
        super(name, price, weight, expirationDate);
        category = "Cake";
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", expirationDate=" + expirationDate +
                ", category='" + category + '\'' +
                '}';
    }
}
