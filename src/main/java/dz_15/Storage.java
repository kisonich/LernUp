package dz_15;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Storage {

    private BlockingQueue<Product> queue = new ArrayBlockingQueue<>(50);

    public void addProduct(Product product){
        try {
            queue.put(product);
            System.out.println(" получили продукт " + product);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Product getProduct(){

        try {
            Product product = queue.take();
            System.out.println(" выгрузил продукт " + product);

            return product;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
