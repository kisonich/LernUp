package dZ4.dz4_new2;
/**
 3. Напишите программу, которая реализует работу магазина.

 Создайте класс Product для реализации товара магазина. У каждого товара есть свое название и целочисленная цена в рублях.
 Добавьте конструктор с двумя параметрами - название и цена.

 Создайте класс Shop для реализации самого магазина. Список товаров храните в поле в массиве размера 7
 (в магазине сейчас ровно столько товаров). При объявлении поля сразу же заполните этот массив любыми 7 товарами.
 Обеспечьте классу Shop следующие методы:
 - getProducts(cost) - возвращает массив товаров, которые стоят не более, чем переданный параметр цены в рублях
 (размер возвращаемого массива должен совпадать с количеством объектов в нем, первым циклом можно определить необходимый размер,
 вторым заполнить созданный массив)
 - containsProduct(name) - возвращает True или False, в зависимости от наличия товара с запрашиваемым названием.
 В названии товара не нужно обращать внимания на регистр (воспользуйтесь методами contains, toLowerCase)
 - findTheCheapest() - возвращает самый дешевый товар в наличии (если таких товаров несколько, находит любой)

 Продумайте для всех методов типы возвращаемых значений и типы параметров. Для всех полей и методов решите делать их статическими или
 нестатическими, определите подходящие по смыслу модификаторы доступа. Придуманные вами названия классов,
 полей и методов должны по смыслу отвечать содержимому.
 */

public class Shop {
    private static Product[] arrProducts = new Product [7];

    public Shop() {

        arrProducts[0] = new Product("Water", 110);
        arrProducts[1] = new Product("Soap", 120);
        arrProducts[2] = new Product("Bread", 130);
        arrProducts[3] = new Product("Meat", 140);
        arrProducts[4] = new Product("Waterr2", 111);
        arrProducts[5] = new Product("Soapp2", 222);
        arrProducts[6] = new Product("Breadd2", 333);

    }
    public static Product[] getProducts(int cost) {
        int count = 0;
        for (int i = 0; i < arrProducts.length; i++){
            if (arrProducts[i].getCost() == cost){
                count++;
            }

        }int j = 0;
        Product[] costProd = new Product[count]; // Second array for added to array Object Product with specified cost
        for (int i = 0; i < costProd.length; i++) {
            if (costProd[i].getCost() == cost){
                costProd[j] = costProd[i];
                j++;
            }
        }
        return costProd;
    }
}
