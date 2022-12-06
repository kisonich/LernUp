package dZ4;

class Shop {
    private static Product[] products = new Product[4];
    public Shop() {
        Product prod1 = new Product("Water", 110);
        Product prod2 = new Product("Soap", 120);
        Product prod3 = new Product("Bread", 130);
        Product prod4 = new Product("Meat", 140);

            products[0] = prod1;
            products[1] = prod2;
            products[2] = prod3;
            products[3] = prod4;
    }
    public  int getProductSize(){
        return products.length;
    }

    public  Product[] getProductsFilter(int price) {
        int count= 0;
        for (int i = 0; i < products.length; i++) {
           if (products[i].getPrice() < price){
               count++;
           }
        }

        int j = 0;
      Product[] pricesProdMensheCeni = new Product[count];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() < price){
                pricesProdMensheCeni[j] = products[i];
                j++;
            }
        }
        return pricesProdMensheCeni;
    }

    public static Product[] getProductsFilterName(String name) {
        int count= 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().toLowerCase().trim().contains(name.toLowerCase().trim())){
                count++;
            }
        }

        int j = 0;
        Product[] productsFilterName = new Product[count];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().toLowerCase().trim().contains(name.toLowerCase().trim())){
                productsFilterName[j] = products[i];
                j++;
            }
        }
        return productsFilterName;
    }
}
