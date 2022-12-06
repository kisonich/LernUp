package goorsLesson4;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Shop runok = new Shop();

        runok.productsArr.add(new Product("Arbuz sol-ileck", 120));
        runok.productsArr.add(new Product("Arbuz krasnodar", 60));
        runok.productsArr.add(new Product("Arbuz astrahan", 70));
        runok.productsArr.add(new Product("Duny", 150));

        runok.kolProdutov();
        Product[] tovaruMenisheCenu = runok.poluchitTovaruMenisheCenu(100);
        System.out.println("Kolichestvo tovarov s cenoy menshe: " + tovaruMenisheCenu.length);

        ArrayList<Product> TovaruPoTextu = runok.poluchitTovaruPoTextu("arbuz");
        System.out.println("Kolichestvo tovarov po textu: " + TovaruPoTextu.size());
    }
}
