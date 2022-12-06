package Test;

import DZ10Collection.Product;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestScannerCase implements Serializable {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String title = scanner.nextLine();
//        int pages = scanner.nextInt();
//        System.out.println(title+"sasssssss");
//        System.out.println(pages + 1);

//        Map<Integer,Product> result = new HashMap();
//        result.put(1,new Product("Soap", 100, 5));
//        result.put(2,new Product("Cocke", 500, 2));
//        System.out.println(result);

//        System.out.println(   getPlanetAtmosphere(scanner));

//
//        Map<Integer, Product> mapProduct = new HashMap<>();
        mapProduct.put(1,new Product("Soap", 100,5));
        mapProduct.put(2,new Product("Bread", 36,30));
        mapProduct.put(1,new Product("Soap", 100,5));
        mapProduct.put(1,new Product("Soap", 100,5));

//        System.out.println(mapProduct);

//        ask();
        System.out.println(mapProduct+ "!!!!");

    }

    static Map<Integer, Product> mapProduct = new HashMap<>();

//    public static void ask() {
//        Scanner scanner = new Scanner(System.in);
//        String menu = "\"What do you want to choose ?\" +\n" +
//                "  \"____МЕНЮ____\\n\" +\n" +
//                "  \"1. Добавить товар\\n\" +\n" +
//                "  \"2. вывести все товары\\n\" +\n" +
//                "  \"3. Выход\"";
//        System.out.println(menu);
//        boolean isWrongAnswer = false;
//        while (!isWrongAnswer) {
//            isWrongAnswer = false;
//            System.out.println("What do you want to choose ?" +
//                    "____МЕНЮ____\n" +
//                    "1. Добавить товар\n" +
//                    "2. вывести все товары\n" +
//                    "3. Выход");
//            switch (scanner.nextInt()) {
//                case 1:
//                    addProd();
//                    break;
//                case 2:
//                    getAllProducts();
//                    break;
//                case 3:
//                    exit();
//                    isWrongAnswer = true;
//                    break;
//
//                default:
//                    System.out.println("Choose from 1 to 3");
////                    isWrongAnswer = true;
//                    break;
//            }
//            System.out.println(menu);
//        }
//    }

    public static Object addProd() {
        Map<Integer, Product> mapProduct = new HashMap<>();

        // сделать сохранять обьект в mapProduct

        Scanner sc = new Scanner(System.in);
        System.out.println("enter key for prod");
        int key = sc.nextInt();
        System.out.println("enter name");
        String val = sc.next();
        System.out.println("enter cost");
        int cst = sc.nextInt();
        System.out.println("enter quantity");
        int qnty = sc.nextInt();
        mapProduct.put(key,new Product(val, cst, qnty));

        mapProduct.put(1, new Product("ewq", 22, 2));

        System.out.println(mapProduct);
        return mapProduct;
    }

    public static void getAllProducts(){


        for(int i = 0; i<= mapProduct.size();i++) {

        }
        System.out.println(mapProduct);
    }


    public static void exit() {
        System.out.println("Exit");
    }
}
