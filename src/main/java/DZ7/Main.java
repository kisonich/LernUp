package DZ7;

class Main {
    public static void main(String[] args) {

        Store shop = new Store(new Product[10]);

        Books harryPotter = new Books("Harry Potter", 200, 300);
        Books bednyeLydi = new Books("Бедные люди", 400, 100);
        Books encyclopedia = new Books("Encyclopedia of anatomy", 1500, 850);
        Books warAndPeace = new Books("War and Peace", 1500, 850);


        Soap neva = new Soap("Neva", 50, 100);
        Soap dove = new Soap("Dave", 40, 100);
        Soap polmolive = new Soap("Polmolive", 50, 100);

        Cakes chocolate = new Cakes("Chocolate", 400, 700, 5);
        Cakes aladdin  = new Cakes("Aladdin", 500, 500,5);
        Cakes napoleon = new Cakes("Napoleon", 750, 500, 4);

        shop.addProd(encyclopedia);
        shop.addProd(harryPotter);
        shop.addProd(bednyeLydi);
        shop.addProd(warAndPeace);


        shop.addProd(chocolate);
        shop.addProd(aladdin);
        shop.addProd(napoleon);

        shop.addProd(neva);
        shop.addProd(dove);
        shop.addProd(polmolive);
//        shop.add_Prod(polmolive);  // Сверх размера массива

        try {

            shop.deleteBooks(shop.getProductsArr(),"Harry Potter");

            shop.deleteCake(shop.getProductsArr(),"Напалеон");

        } catch (NonExistentProduct exc) {
            System.out.println(exc);
        }

        shop.all_Books(shop.getProductsArr());
        shop.all_Cakes(shop.getProductsArr());
        shop.all_Soap(shop.getProductsArr());
    }
}