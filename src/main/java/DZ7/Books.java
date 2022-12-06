package DZ7;

public class Books extends Product {
    int expiration_date = -1;
    String category = "Book";

    public Books(String name, int price, int weight) {
        super(name, price, weight);
        super.setCategory(category);
        super.setExpiration_date(expiration_date);
    }
}
