package DZ15;

import java.util.List;

//import static DZ15.Ship.shipList;

class Crane implements Runnable {

    private String name;
    private int size;
    public Crane(String name, int size) {
        this.name = name;
        this.size = size;
    }


    public void run() {
        while (true) {


            List<Product> skladProducts = Sklad.getProducts(size);

            Ship ship = new Ship(size);
            ship.loadProducts(skladProducts);
//            try {
//                Product j = warehouseQueue.take(); // Забирает обект из очереди
//                System.out.println("Crane take " + " " + warehouseQueue.size());
//
//                shipList.addAll(warehouseQueue);
//                System.out.println(shipList + "!!!!" + "" + j.toString());
//
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                '}';
    }
}
