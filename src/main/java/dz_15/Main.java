package dz_15;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Имеются корабли, которые представляют собой списки разных размеров.
 * Имеется склад с товарами. Для товара можно создать отдельный тип данных. Есть поставщики, которые периодически привозят новые товары
 * на склад и есть кран, который перекладывает товары со склада в подходящие корабли.
 * <p>
 * Сделать порт конфигурируемым т.е. возможность выбрать количество кранов.
 * реализовать очередь из кораблей на загрузку.
 * <p>
 * Краны, поставщики, и подача новых кораблей должны работать асинхронно
 */
public class Main {
    static int counter = 0;

    public static void main(String[] args) {

        Port port = new Port(3);

        Thread threadProvider = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                        port.addProductsToStore(createProvider());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });


        Thread threadShip = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                        port.addShipToQueue(new Ship());
                }
            }
        });

        threadProvider.start();
        threadShip.start();
    }

    private static Provider createProvider() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Soap" + counter++));
        products.add(new Product("Bread" + counter++));
        products.add(new Product("Water" + counter++));
        products.add(new Product("Oil" + counter++));

        Provider provider = new Provider(products);
        return provider;
    }
}
