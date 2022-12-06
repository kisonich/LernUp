package DZ5;

public class Store {

    private Product[] productsArr;

    private int productCount;

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public Product[] getProductsArr() {
        return productsArr;
    }

    public void setProductsArr(Product[] productsArr) {
        this.productsArr = productsArr;
    }


    public void addProduct(Product prod) {
        if (productCount < productsArr.length) {
            productsArr[productCount] = prod;
            productCount++;
        } else {
            int new_product_length = productsArr.length * 2;
            Product[] new_products = new Product[new_product_length];

            for (int i = 0; i < productsArr.length; i++) {
                new_products[i] = productsArr[i];
            }

            productsArr = new_products;

            productsArr[productCount] = prod;
            productCount++;
        }
    }

    public void searchByExpirationDate(Product[] products, int expirationDate) {
        int productsCounter = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getExpiration_date() >= expirationDate || products[i].getExpiration_date() == -1) {
                    productsCounter++;
                }
            } else  {
                continue;
            }
        }

        Product[] searchedProducts = new Product[productsCounter];

        int g = 0;

        for (int j = 0; j < products.length; j++) {
            if (products[j] != null) {
                if (products[j].getExpiration_date() >= expirationDate && g < searchedProducts.length || products[j].getExpiration_date() == -1) {
                    searchedProducts[g] = products[j];
                    g++;
                }
            }
        }

        System.out.println();
        System.out.println("give an array of products that have an expiration date of at least the parameter " + expirationDate);


        for (int i = 0; i < searchedProducts.length; i++) {
            System.out.println(searchedProducts[i].getName());
        }

        System.out.println();
    }


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
