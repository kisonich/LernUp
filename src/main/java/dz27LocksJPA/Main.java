package dz27LocksJPA;

import dz26Transactional.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/*
Сделать задачу из урока 26, только с использованием версионирования. Версионирование делаем для сущности склада книг.
Добавить в энтити класс поле версия. Кидать исключение оптимистичной блокировки для случаев несоответствия версий.
 */

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        WarehouseService bean = context.getBean(WarehouseService.class);
//        bean.testContext();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bean.testContextSlow();
            }
        });


        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                bean.testContext();
            }
        });

        thread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread2.start();
    }

}
// 1 street