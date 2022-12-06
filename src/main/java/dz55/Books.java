package dz55;

public class Books extends Product {
    int expiration_date = -1;
//    String category = "Book";

    public Books(String name, int price, int weight) {
        super(name, price, weight, "Book");

    }
}
