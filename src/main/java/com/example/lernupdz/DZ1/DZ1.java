package com.example.lernupdz.DZ1;

public class DZ1 {
    public static void main(String[] args) {
        String name = "Mark Elliot Zuckerberg";
        int age = 37;
        int amount = 1700;
        float rate = 3.4f;
        float month = amount * rate / 100 ;
        float sixty = 60 - age;
        System.out.println("Начисление за месяц " + month);
        System.out.println("Сумма влада, " + name + " к 60 годам составит - " + ((amount * rate) / 100 * (12 * sixty) - amount));
    }

}
// String - не примитивный тип данных. Все значения String не изменяемые.