package DZ7;

public class Product {
    private String name;
    private int price;
    private int weight;
    private int expiration_date = 0;
    private String category = "Products";

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
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

    public void setPrice(int price) {
        this.price = price;
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

    public void setExpiration_date(int expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}// private для инкапсуляции.

// Доработайте или переделайте магазин из прошлого задания так,
// чтобы у вас теперь класс продукта был родительским классом для разных видов продуктов: книг, тортов и мыла.
// Каждый товар должен помимо названия и цены отвечать на вопрос о своём весе,
// о сроке годности (для мыла и книг возвращать -1, а для торта должна быть возможность задать в конструкторе)
// и о категории товаров (просто текст “книги”, “мыло”, “торты”). У магазина должны появиться методы:
// 1) привести массив товаров у которых срок годности не меньше параметра (причём мыло и книги всегда подойдут)
// 2) привести массив всех книг (тип массива должен быть соответствующий - из книг, не из продуктов);
// 3) привести массив всех тортов;
// 4) привести массив всех мыл.