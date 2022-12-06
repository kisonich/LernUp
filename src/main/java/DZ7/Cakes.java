package DZ7;

public class Cakes extends Product {
    String category = "Cake";

    public Cakes(String name, int price, int weight, int expiration_date){
        super(name, price, weight);
        super.setExpiration_date(expiration_date);
        super.setCategory(category);
    }
}
