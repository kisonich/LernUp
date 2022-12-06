package DZ15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorServicePort = Executors.newFixedThreadPool(2);
        executorServicePort.submit(new Supplier("First"));
        executorServicePort.submit(new Crane("Second", 10));
//        executorServicePort.submit(new Ship(10) );


    }
}