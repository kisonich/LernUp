package DZ15;

import java.util.ArrayList;
import java.util.List;

class Ship {

    private int size;
    Product [] products;



        public Ship(int size) {
        this.size = size;
        products = new Product[size];
    }

    public int getSize(){
            return size;
    }

    public boolean loadProducts(List<Product> loadProducts){
        if (loadProducts.size() >= products.length){
            return false;
        }
        else {
            int count = 0;
            for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                    count++;
                    products[i] = loadProducts.get(i);
                }

            }
            if (count == loadProducts.size())
                return true;
            else
                return false;
        }
    }
}
