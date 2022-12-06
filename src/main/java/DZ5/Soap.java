package DZ5;

public class Soap extends Product{
    int expiration_date = -1;
    String category = "Soap";

    public Soap(String name, int price, int weight) {
        super(name, price, weight);
        super.setCategory(category);
        super.setExpiration_date(expiration_date);
    }
}
