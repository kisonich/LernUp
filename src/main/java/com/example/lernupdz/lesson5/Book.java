package com.example.lernupdz.lesson5;

public class Book extends Product{
    public Book(String name, double price, double weight) {
        super(name, price, weight);
        category = "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", expirationDate=" + expirationDate +
                ", category='" + category + '\'' +
                '}';
    }
}
