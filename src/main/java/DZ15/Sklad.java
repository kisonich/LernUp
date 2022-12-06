package DZ15;
/**
 Имеются корабли, которые представляют собой списки разных размеров.
 Имеется склад с товарами. Для товара можно создать отдельный тип данных. Есть поставщики, которые периодически привозят новые товары
 на склад и есть кран, который перекладывает товары со склада в подходящие корабли.

 * Сделать порт конфигурируемым т.е. возможность выбрать количество кранов.
 * реализовать очередь из кораблей на загрузку.
 *
 Краны, поставщики, и подача новых кораблей должны работать асинхронно
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sklad {

//    static ArrayBlockingQueue<Product> warehouseQueue = new ArrayBlockingQueue<>(5);
    private static List list = Collections.synchronizedList(new ArrayList());

    public static void addProducts(ArrayList<Product> products){
        synchronized(list) {
           list.addAll(products);
        }
    }

    public static List<Product> getProducts(int size){
        ArrayList<Product> newProducts = new ArrayList<Product>();
        synchronized (list){
            for (int i = 0; i < size; i++){
                Product product = (Product) list.get(i);
                newProducts.add(product);
                list.remove(i);
            }

        }
        return newProducts;
    }

}

