package com.example.lernupdz.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shop5 shop = new Shop5();

        shop.CountProducts();
        System.out.println(Arrays.asList(shop.returnProdArr(3)));
        System.out.println(Arrays.asList(shop.arrayBooks("Book")));

        System.out.println(Arrays.asList(shop.allCakes("Cake")));

        System.out.println(Arrays.asList(shop.allSoaps("Soap")));
    }
}
