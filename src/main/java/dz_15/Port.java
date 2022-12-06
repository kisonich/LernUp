package dz_15;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Port {
    private ExecutorService cranes;
    private BlockingQueue<Ship> queueShips;
    private Storage storage = new Storage();

    Port(int cranesCount) {
        this.queueShips = new ArrayBlockingQueue<>(cranesCount);
        this.cranes = Executors.newFixedThreadPool(cranesCount);
        for (int i = 0; i < cranesCount; i++) {
            cranes.submit(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Ship ship = queueShips.take();
                            System.out.println(Thread.currentThread().getName() + " Начал загружать " + ship);
                            while (ship.isNotFull()) {
                                Product product = storage.getProduct();
                                ship.addProduct(product);
                            }
                            System.out.println(Thread.currentThread().getName() + " Закончил загружать " + ship);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            });
        }
    }

    public void addShipToQueue(Ship ship){
        try {
            queueShips.put(ship);
            System.out.println(ship + " Встал в очередь ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void addProductsToStore(Provider provider){
        provider.loadProductsToStorage(storage);
    }

}
