package DZ15;

import dz55.Shop;

import java.util.ArrayList;
import java.util.Arrays;

class Supplier implements Runnable {
    private String name;

    public Supplier(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void run() {
        while (true) {
            ArrayList<Product> products = new ArrayList<Product>();
            products.add(new Product(name+ "1"));
            products.add(new Product(name+ "2"));
            products.add(new Product(name+ "3"));
            products.add(new Product(name+ "4"));
            products.add(new Product(name+ "5"));

            Sklad.addProducts(products);
            System.out.println("Supplier added " + Arrays.toString(products.toArray()));
        }
    }
}
