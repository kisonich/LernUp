package goorsLesson4;

import java.util.ArrayList;

public class Shop {

    //    public Products ProductsArr [] = new Products[100];
    public ArrayList<Product> productsArr = new ArrayList<>();

    public void kolProdutov() {
        System.out.println("kolProdutov:" + productsArr.size());
    }

    public Product[]  poluchitTovaruMenisheCenu(int price) {

        int kolMenshe = 0;
        for (Product itVar : productsArr
        ) {
            if (itVar.price <= price) {
                kolMenshe = kolMenshe + 1;
            }
        }

        Product[] tovaruMenisheCenu = new Product[kolMenshe];

        kolMenshe = 0;
        for (Product itVar : productsArr) {
            if (itVar.price <= price) {
                tovaruMenisheCenu[kolMenshe] = itVar;
                kolMenshe = kolMenshe + 1;
            }
        }
        return tovaruMenisheCenu;
    }

    public ArrayList<Product>  poluchitTovaruPoTextu(String text) {

        ArrayList<Product> TovaruPoTextu = new ArrayList<>();

        for (Product itVar : productsArr
        ) {
            String name = itVar.name.toLowerCase();
            if (name.contains(text.toLowerCase()))  {
                TovaruPoTextu.add(itVar);
            }
        }
        return TovaruPoTextu;
    }
}