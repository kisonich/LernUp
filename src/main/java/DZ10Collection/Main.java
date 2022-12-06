package DZ10Collection;

import java.util.Map;
import java.util.Scanner;

/**
 Создать программу-базу данных магазина
 базу реализовать в виде списка мапов
 поля каждого товара: название, стоимость, количество на складе

 функционал:
 1) возможность добавить новый функционал вводя данные с клавиатуры https://younglinux.info/java/system-in
 2) вывод содержимого базы в виде таблицы в консоль
 3) управление программой осуществлять через меню вида:

 ____МЕНЮ____
 1. Добавить товар
 2. вывести все товары
 3. Выход

 программа просит выбрать пункт меню написав цифру в терминал и затем запрашивает ввод данных или
  выводит таблицу. После чего выводит меню снова, пока не будет выбран пункт "Выход"
 */

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ask();
    }
        public static void ask() {
        Shop shop = new Shop();
            String menu = "\"What do you want to choose ? \n" +
                    "  \"____МЕНЮ____ \n" +
                    "  \"1. Добавить товар\n" +
                    "  \"2. Вывести все товары\n" +
                    "  \"3. Выход\"";
            System.out.println(menu);
            boolean isWrongAnswer = false;
            while (!isWrongAnswer) {
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("enter name");
                        String val = sc.next();
                        System.out.println("enter cost");
                        int cst = sc.nextInt();
                        System.out.println("enter quantity");
                        int qnty = sc.nextInt();
                        Map<String, Product> mapProduct = shop.addProd(val,cst,qnty);
                        for (String key: mapProduct.keySet()) {
                            String value = mapProduct.get(key).toString();
                            System.out.println(key + " " + value);
                        }
                        System.out.println("Product added");
                        break;
                    case 2:
                        shop.getAllProducts();
                        break;
                    case 3:
                        shop.exit();
                        isWrongAnswer = true;
                        break;
                    default:
                        System.out.println("Choose from 1 to 3");
//                    isWrongAnswer = true;
                        break;
                }
                System.out.println(menu);
            }
        }


}

