package com.example.lernupdz.lesson5;

import java.util.ArrayList;

public class Shop5 {

   Product[] productsArray = new Product[]{
            new Soap("Dave",150.99,0.1),
            new Soap("Neva",170.50,0.2),
            new Cake("Napoleon",700,1,4),
            new Cake("Don-Pancho",850,1.3,2),
            new Book("Animal world",500,1.5),
            new Book("Encyclopedia of anatomy",4600,2.4)
    };

    public void CountProducts(){
        System.out.println("Count product in shop = " + productsArray.length);
    }
    public Product[] returnProdArr(int date){
        Product[] prod;
        int i = 0;
        for (Product product : productsArray) {
            if (product.expirationDate >= date || product.expirationDate == -1) {
                i++;
            }
        }

        prod = new Product[i];
        for (int a = 0; a < prod.length; a++) {
            for (Product product : productsArray) {
                if (product.expirationDate >= date || product.expirationDate == -1) {
                    prod[a] = product;
                    a++;
                }
            }
        }
        return prod;
    }

    public Product[] arrayBooks(String text) {
        Product[] books;
        int i = 0;
        for (Product product : productsArray) {
            if (product.category.contains(text)) {
                i++;
            }
        }

        books = new Product[i];
        for (int a = 0; a < books.length; a++) {
            for (Product product : productsArray) {
                if (product.category.contains(text)) {
                    books[a] = product;
                    a++;
                }
            }
        }
        return books;
    }

    public Product[] allCakes(String text) {
        Product[] cakes;
        int i = 0;
        for (Product product : productsArray) {
            if (product.category.contains(text)) {
                i++;
            }
        }

        cakes = new Product[i];
        for (int a = 0; a < cakes.length; a++) {
            for (Product product : productsArray) {
                if (product.category.contains(text)) {
                    cakes[a] = product;
                    a++;
                }
            }
        }
        return cakes;
    }

    public Product[] allSoaps(String text) {
        Product[] soaps;
        int i = 0;
        for (Product product : productsArray) {
            if (product.category.contains(text)) {
                i++;
            }
        }

        soaps = new Product[i];
        for (int a = 0; a < soaps.length; a++) {
            for (Product product : productsArray) {
                if (product.category.contains(text)) {
                    soaps[a] = product;
                    a++;
                }
            }
        }
        return soaps;
    }
}