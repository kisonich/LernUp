package dz26Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/*
Реализовать транзакционность при покупке книг в вашем магазине.
Если несколько пользователей одновременно пытаются купить одну и ту же книгу с остатком 1, она должна достаться только одному из покупателей,
остальные должны получить сообщение, что данная книга была куплена другим пользователем. Попробовать с анатациями
 */

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.makeOrder(1 , "QWee", 1);

    }

}
