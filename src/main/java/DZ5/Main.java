package DZ5;

class Main {
    public static void main(String[] args) {

        Store shop = new Store();

        shop.setProductsArr(new Product[2]);
        shop.setProductCount(0);

        Books harryPotter = new Books("Harry Potter", 200, 300);
        Books bednyeLydi = new Books("Бедные люди", 400, 100);
        Books encyclopedia = new Books("Encyclopedia of anatomy", 1500, 850);

        Soap  neva = new Soap ("Neva", 50, 100);
        Soap  dove = new Soap ("Dave", 40, 100);
        Soap  polmolive = new Soap ("Polmolive", 50, 100);

        Cakes chocolate = new Cakes ("Chocolate", 400, 700, 5);
        Cakes aladdin  = new Cakes ("Aladdin", 500, 500,5);
        Cakes napoleon = new Cakes ("Napoleon", 750, 500, 4);

        shop.addProduct(encyclopedia);
        shop.addProduct(harryPotter);
        shop.addProduct(bednyeLydi);

        shop.addProduct(neva);
        shop.addProduct(dove);
        shop.addProduct(polmolive);

        shop.addProduct(chocolate);
        shop.addProduct(aladdin);
        shop.addProduct(napoleon);

        shop.searchByExpirationDate(shop.getProductsArr(), 5);

        shop.all_Books(shop.getProductsArr());
        shop.all_Soap(shop.getProductsArr());
        shop.all_Cakes(shop.getProductsArr());

    }
}