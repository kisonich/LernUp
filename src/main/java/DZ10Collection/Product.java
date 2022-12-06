package DZ10Collection;

public class Product {
    private String name;
    private int cost;
    private int quantity;

    public Product(String name, int cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                '}';
    }
}