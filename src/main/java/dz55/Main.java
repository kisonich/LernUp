package dz55;

import java.util.Arrays;

/**
 *4. Доработайте или переделайте магазин из прошлого задания так, чтобы у вас теперь класс продукта был родительским классом для разных видов продуктов: книг, тортов и мыла. Каждый товар должен помимо названия и цены отвечать на вопрос о своём весе, о сроке годности (для мыла и книг возвращать -1, а для торта должна быть возможность задать в конструкторе) и о категории товаров (просто текст “книги”, “мыло”, “торты”). У магазина должны появиться методы: 1) привести массив товаров у которых срок годности не меньше параметра (причём мыло и книги всегда подойдут) 2) привести массив всех книг (тип массива должен быть соответствующий - из книг, не из продуктов); 3) привести массив всех тортов; 4) привести массив всех мыл.
 *
 * ///////////////07. Исключения///
 * 9. Доработайте или переделайте магазин из прошлого задания №5* так, что теперь из магазина можно удалять продукты по ключевым словам в названии. Если такого продукта не находится - выкидывается исключение вашего собственного типа данных. Подумайте, сделать его проверяемым или нет, напишите свои мысли в комментарии к классу исключения. Также у магазаина должен быть метод добавления товаров, а конструктор магазина принимать параметром максимальный размер магазина и при попытке добавить сверх этого лимита должно выкидываться исключение
 */
public class Main {
    public static void main(String[] args) {
    Shop shop = new Shop();
//        System.out.println(Arrays.toString(shop.getProductsFilter(6)));

//        try {
//            shop.deleteProduct("assa");
//        } catch (NotFoundException e) {
//            System.out.println("not found");
//            throw new RuntimeException(e);
//        }

        try {
            shop.addProduct(new Cakes("Napolion223", 6200, 950,5));
        } catch (MaxLimitException e) {
            System.out.println("No space in the array");
            throw new RuntimeException(e);
        }
    }
}
