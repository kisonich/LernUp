package dz28MWC.repository;

import dz28MWC.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository <Book, Integer> {

    List<Book> findByNamebookAndCost(String name, int cost);

//    List<Book> findByCostContaining(int cost);


    Book findByNamebook(String namebook);

}
