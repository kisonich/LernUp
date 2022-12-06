package com.example.lernupdz.lesson5;

import java.util.ArrayList;

public class Soap extends Product{

    public Soap(String name, double price, double weight) {
        super(name, price, weight);
        category = "Soap";
    }

    @Override
    public String toString() {
        return "Soap{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", expirationDate=" + expirationDate +
                ", category='" + category + '\'' +
                '}';
    }
}
