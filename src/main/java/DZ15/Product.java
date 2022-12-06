package DZ15;

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }

}
