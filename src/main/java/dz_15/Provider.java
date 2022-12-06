package dz_15;

import java.util.ArrayList;
import java.util.List;

public class Provider {
    private List <Product> productList;

    public Provider(List<Product> productList) {
        this.productList = productList;
    }

    public void loadProductsToStorage(Storage storage){
        System.out.println(this + " Начал загружать продукты на склад ");
        for (Product product : productList) {
            storage.addProduct(product);
        }
    }


}
