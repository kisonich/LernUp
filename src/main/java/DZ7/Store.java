package DZ7;

public class Store {
    public Store(Product[] productsArr) {
        this.productsArr = productsArr;
    }

    private Product[] productsArr;

    private int productCount;


    public Product[] getProductsArr() {
        return productsArr;
    }

    public void deleteBooks (Product[] books, String name) throws NonExistentProduct {

        int counter = 0;
        for (int i=0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getName().contains(name)) {
                    counter++;
                }
            }
        }
        try {
            if (counter == 0)  {
                throw new NonExistentProduct ("Books for the specified parameters were not found");
            }

            for (int i = 0; i < books.length; i++) {
                if (books[i] != null) {
                    if (books[i].getName().contains(name)) {
                        books[i] = null;
                        System.out.println("The book was deleted");
                    }
                }

            }
        } catch (NonExistentProduct exc) {
            System.out.println(exc);
        }
    }
    //////////////////////////////////////////////////
    public void deleteCake (Product[] cake, String name) throws NonExistentProduct {

        int count = 0;
        for (int i=0; i < cake.length; i++) {
            if (cake[i] != null) {
                if (cake[i].getName().contains(name)) {
                    count++;
                }
            }
        }
        try {
            if (count == 0)  {
                throw new NonExistentProduct ("Coke for the specified parameters were not found");
            }

            for (int i = 0; i < cake.length; i++) {
                if (cake[i] != null) {
                    if (cake[i].getName().contains(name)) {
                        cake[i] = null;
                        System.out.println("The coke was deleted");
                    }
                }

            }
        } catch (NonExistentProduct exc) {
            System.out.println(exc);
        }
    }
////////////////////////////////////////////////////////

public void addProd(Product prod) {
    System.out.println();
    try {
        productsArr[productCount] = prod;
        productCount++;
        System.out.println("Товар был добавлен!!!!!");
    } catch (IndexOutOfBoundsException e) {
        System.out.println("Ошибка! Попытка добавить элемент в массив, сверх его лимита ");
        throw e;
    }
}

//    public void addProduct(Product prod) {
//        if (productCount < productsArr.length) {
//            productsArr[productCount] = prod;
//            productCount++;
//            System.out.println("Книга была добавлена!!!!!");
//
//        } else {
//            int new_product_length = productsArr.length * 2;
//            Product[] new_products = new Product[new_product_length];
//
//            for (int i = 0; i < productsArr.length; i++) {
//                new_products[i] = productsArr[i];
//            }
//
//            productsArr = new_products;
//
//            productsArr[productCount] = prod;
//            productCount++;
//        }
//    }

    public void all_Books (Product[] products) {
        int booksCounter = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getCategory() == "Book") {
                    booksCounter++;
                }
            } else  {
                continue;
            }
        }

        Books[] searchedBooks = new Books[booksCounter];

        int g = 0;

        for (int j = 0; j < products.length; j++) {
            if (products[j] != null) {
                if (products[j].getCategory() == "Book") {
                    if (g < searchedBooks.length) {
                        searchedBooks[g] = (Books) products[j];
                        g++;
                    }
                }
            }
        }
        System.out.println("Array of all books:");
        for (int i = 0; i < searchedBooks.length; i++) {
            if (i != searchedBooks.length - 1) {
                System.out.print(searchedBooks[i].getName() + ", ");
            } else {
                System.out.print(searchedBooks[i].getName());
            }
        }
        System.out.println();
    }

    public void all_Soap (Product[] products) {
        int soapCounter = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getCategory() == "Soap") {
                    soapCounter++;
                }
            } else  {
                continue;
            }
        }

        Soap[] searchedSoap = new Soap[soapCounter];

        int g = 0;

        for (int j = 0; j < products.length; j++) {
            if (products[j] != null) {
                if (products[j].getCategory() == "Soap") {
                    if (g < searchedSoap.length) {
                        searchedSoap[g] = (Soap) products[j];
                        g++;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Array of all soap:");
        for (int i = 0; i < searchedSoap.length; i++) {
            if (i != searchedSoap.length - 1) {
                System.out.print(searchedSoap[i].getName() + ", ");
            } else {
                System.out.print(searchedSoap[i].getName());
            }
        }
        System.out.println();
    }

    public void all_Cakes (Product[] products) {
        int cakesCounter = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getCategory() == "Cake") {
                    cakesCounter++;
                }
            } else  {
                continue;
            }
        }

        Cakes[] searchedCakes = new Cakes[cakesCounter];

        int g = 0;

        for (int j = 0; j < products.length; j++) {
            if (products[j] != null) {
                if (products[j].getCategory() == "Cake") {
                    if (g < searchedCakes.length) {
                        searchedCakes[g] = (Cakes) products[j];
                        g++;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Array of all cakes:");
        for (int i = 0; i < searchedCakes.length; i++) {
            if (i != searchedCakes.length - 1) {
                System.out.print(searchedCakes[i].getName() + ", ");
            } else {
                System.out.print(searchedCakes[i].getName());
            }
        }
        System.out.println();
    }
}
