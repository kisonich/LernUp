package dz_15;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Product> listProducts = new ArrayList<>();

    private int maxSize = 10;

    public void addProduct(Product product) {
        System.out.println(this + " Получили продукт " + product);
        listProducts.add(product);
    }

    public boolean isNotFull() {
        if (listProducts.size() < maxSize) {
            return true;
        }
         return false;
    }


}
