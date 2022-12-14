package dz24JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        BookRepository bookRepository = context.getBean(BookRepository.class);
//        Book book = new Book();
//        book.setBookid(1);
//        book.setNamebook("Book");
//        book.setCost(1500);
//        book.setYear(LocalDate.now());
//
//        bookRepository.save(book);
//
        Optional<Book> bookRepositoryById = bookRepository.findById(1);
//        bookRepositoryById.ifPresent( b -> System.out.println(b.toString()));
//
//        AuthorRepository authorRepository = context.getBean(AuthorRepository.class);
//        Author author = new Author();
//        author.setId(1);
//        author.setFio("Firstname Lastname");
//
//        authorRepository.save(author);
//
//        Optional<Author> authorRepositoryById = authorRepository.findById(1);
//        authorRepositoryById.ifPresent( b -> System.out.println(b.toString()));
//
//        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
//        Customer customer = new Customer();
//        customer.setCustomerid(1);
//        customer.setFio("Firstnamee Lastnamee");
//        customer.setAge(LocalDate.now());
//
//        customerRepository.save(customer);
//
//        Optional<Customer> customerRepositoryById = customerRepository.findById(1);
//        customerRepositoryById.ifPresent( b -> System.out.println(b.toString()));


        OrderRepository orderRepository = context.getBean(OrderRepository.class);
        Orders orderr = new Orders();
        orderr.setOrderid(2);
        orderr.setFio("qwe");
        orderr.setPurchaseamount(550);

//        orderRepository.save(orderr);

        Optional<Orders> orderRepositoryById = orderRepository.findById(1);
        orderRepositoryById.ifPresent( b -> System.out.println(b.toString()));

        WarehouseRepository warehouseRepository = context.getBean(WarehouseRepository.class);
        Warehouse warehouse = new Warehouse();
        warehouse.setWarehouseid(1);
        warehouse.setAddress(" 1 street");

        WarehouseBook warehouseBook = new WarehouseBook();
        warehouseBook.setWarehousebookid(1);
        warehouseBook.setWarehouse(warehouse);
        warehouseBook.setBook(bookRepositoryById.get());

        warehouse.setWarehouseid(1);
        warehouse.setBooks(List.of(warehouseBook));

        warehouseRepository.save(warehouse);

        Iterable<Warehouse> all = warehouseRepository.findAll();
        System.out.println(all);

    }
}
