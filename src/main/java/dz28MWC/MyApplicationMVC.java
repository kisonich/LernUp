package dz28MWC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
Сделать страницу со списком книг на Spring MVC + thymeleaf.
Подключить SpringWeb
Сделать класс размеченный аннотацией Controller
Сделать метод возвращающий ModelAndView
Возвращать веб страницу с информацией и списке книг на складе с фильтром по наименованию и цене.
Список книг нужно брать, использую BookStoreRepository из прошлых уроков
 */

@SpringBootApplication
public class MyApplicationMVC {

    public static void main(String[] args) {
        SpringApplication.run(MyApplicationMVC.class, args);
    }

}
//public class Main {
//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
////
////        OrderService orderService = context.getBean(OrderService.class);
////        orderService.makeOrder(1 , "QWee", 1);
//
//    }
//
//}
