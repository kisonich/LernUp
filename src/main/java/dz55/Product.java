package dz55;

public class Product {
    private String name;
    private int price;
    private int weight;
    private int expiration_date = -1;
    private String category = "Products";

    public Product(String name, int price, int weight, String category, int expiration_date) {
        this.name = name;
        setPrice(price);
        this.weight = weight;
        setCategory(category);
        setExpiration_date(expiration_date);
    }

    public Product(String name, int price, int weight, String category) {
        this.name = name;
        setPrice(price);
        this.weight = weight;
        setCategory(category);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public boolean setPrice(int price) {
        if (price < 1) {
            return false;
        }
        else {
            this.price = price;
            return true;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getExpiration_date() {
        return expiration_date;
    }

    public boolean setExpiration_date(int expiration_date) {
        if (expiration_date > 0) {
            this.expiration_date = expiration_date;
            return true;
        }
        else
            return false;
    }

    public String getCategory() {
        return category;
    }

    public boolean setCategory(String category) {
        if (category == null) {
            return false;
        }
         else {
             this.category = category;
             return true;
        }

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", expiration_date=" + expiration_date +
                ", category='" + category + '\'' +
                '}';
    }
}