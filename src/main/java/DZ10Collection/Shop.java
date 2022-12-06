package DZ10Collection;
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
import java.util.*;

class Shop {
    static Map<String, Product> mapProduct = new HashMap<>();

    public Shop() {
        Product product = new Product("Soap", 100,5);
        mapProduct.put(product.getName(), product);

        mapProduct.put("Water",new Product("Water", 100,10));
        mapProduct.put("Bread",new Product("Bread", 36,30));
        mapProduct.put("Apple",new Product("Apple", 70,5));
        mapProduct.put("Meat",new Product("Meat", 400,15));
    }


    public Map<String, Product> addProd(String name, int cost, int quantity) {
        if (mapProduct.containsKey(name)){
           Product product = mapProduct.get(name);
           int oldQuantity = product.getQuantity();
           product.setQuantity(oldQuantity + quantity);
           product.setCost(cost);
        }
        else {
            mapProduct.put(name, new Product(name, cost, quantity));
        }


        return mapProduct;
    }

    public void getAllProducts() {

        for (int i = 0; i <= mapProduct.size(); i++) {

        }
        System.out.println(mapProduct);
        System.out.println("All products");
    }

    public void exit() {
        System.out.println("Exit");
    }
}
