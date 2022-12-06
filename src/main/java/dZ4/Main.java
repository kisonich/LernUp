package dZ4;



/**
  У вас есть товар, у которого есть название и цена. Разработайте класс для объектов описания товара. У вас есть магазин,
 в ассортименте которого есть товары в неограниченном количестве (храните в поле в массиве). Напишите класс для объекта магазина,
 причём он должен уметь отвечать на вопросы: 1) сколько товаров есть в магазине;
 2) возвращать массив товаров меньше указанной в параметре метода цены (первым циклом посчитайте количество таких товаров,
 создайте массив размером в это количество, заполните его подходящими товарами);
 3) искать товары (возвращать набор из найденных) по наличию в названии указанного в параметре текста без учёта регистра
(см. в сторону таких методов строки как contains и toLowerCase).
*/
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println("Kolichestvo tovarov  " + shop.getProductSize());

        Product[] firstMethod = shop.getProductsFilter(130);
        System.out.println(firstMethod.length);
        System.out.println(shop.getProductsFilter(120).length);

        System.out.println(shop.getProductsFilterName("Water").length);

    }
}

