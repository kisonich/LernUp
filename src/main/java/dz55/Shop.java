package dz55;


import java.util.Arrays;

public class Shop {

    private static Product[] products = new Product[5];

    public Shop() {
        Product prod1 = new Soap("Dave", 250, 30);
        Product prod2 = new Cakes("Napolion", 600, 500,30);
        Product prod3 = new Books("History", 1000,400);
        Product prod4 = new Soap("Dave22", 2450, 30);
        Product prod5 = new Cakes("Napolion22", 6200, 950,5);


        products[0] = prod1;
        products[1] = prod2;
        products[2] = prod3;
        products[3] = prod4;
        products[4] = prod5;

    }
    public  Product[] getProductsFilter(int expiration_date) {
        int count= 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getExpiration_date() >= expiration_date ||
            products[i].getExpiration_date() == -1){
                count++;
            }
        }

        int j = 0;
        Product[] expirationDateProduct = new Product[count];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getExpiration_date() >= expiration_date ||
                    products[i].getExpiration_date() == -1){

                expirationDateProduct[j] = products[i];
                j++;
            }
        }
        return expirationDateProduct;
    }

    public Product[] books(){
        int count= 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().equals("Book")) {
                count++;
            }
        }

        int j = 0;
        Product[] bookProd = new Product[count];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().equals("Book")){

                bookProd[j] = products[i];
                j++;
            }
        }
        return bookProd;
    }

    public void deleteProduct(String keyword) throws NotFoundException {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().toLowerCase().contains(keyword.toLowerCase())){
                products[i] = null;
                System.out.println(Arrays.toString(products));
                break;
            }
        }
        throw new NotFoundException();
    }
    public void addProduct(Product product) throws MaxLimitException {
        for (int i = 0; i < products.length; i++) {
        if (products[i] == null){
            products[i] = product;
            System.out.println(Arrays.toString(products));

        }
        }
        throw new MaxLimitException();
    }
}
