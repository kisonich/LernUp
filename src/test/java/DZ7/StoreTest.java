package DZ7;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void deleteBooks() throws NonExistentProduct {

        Books bednyeLydi = new Books("Бедные люди", 400, 100);
        Books encyclopedia = new Books("Encyclopedia of anatomy", 1500, 850);
        Books warAndPeace = new Books("War and Peace", 1500, 850);

        Books[] books = {bednyeLydi, encyclopedia, warAndPeace};
        Store store = new Store(books);

        store.deleteBooks(books, "Encyclopedia of anatomy");

        Assertions.assertNull(books[1]);
    }

    @Test
    void doesNotDeleteBooks() throws NonExistentProduct {

        Books bednyeLydi = new Books("Бедные люди", 400, 100);
        Books encyclopedia = new Books("Encyclopedia of anatomy", 1500, 850);
        Books warAndPeace = new Books("War and Peace", 1500, 850);

        Books[] books = {bednyeLydi, encyclopedia, warAndPeace};
        Store store = new Store(books);

        store.deleteBooks(books, "Encyclope anatomy");

        for (Books book : books) {
            Assertions.assertNotNull(book);
        }
    }
    @Test
    void addProd(){
        Product [] products = new Product[1] ;
        Store store = new Store(products);


        Books war_and_peace = new Books("War and Peace", 1500, 850);
        store.addProd(war_and_peace);


        Assertions.assertNotNull(store.getProductsArr());
        Assertions.assertNotNull(store.getProductsArr()[0]);
        Assertions.assertEquals(war_and_peace, store.getProductsArr()[0]);
    }

    @Test
    void doesNotAddProd(){
        Product [] products = new Product[1] ;
        Store store = new Store(products);

        Books war_and_peace = new Books("War and Peace", 1500, 850);
        store.addProd(war_and_peace);

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()->store.addProd(war_and_peace));
    }
}