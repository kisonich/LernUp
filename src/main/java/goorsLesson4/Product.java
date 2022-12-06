package goorsLesson4;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("Constructor: " + name + " " + price);
    }
}
