package dz21AOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

/* Делаем аннотации:
LogMethod - все методы помеченные данной аннотацией должны логгировать имя метода параметры метода и возвращаемое значение
WorkTime - все методы помеченные данной аннотацией должны выводить название метода и время работы метода

Применить АОП, чтобы данные аннотации работали в вашем проекте
 */

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        Worker worker = context.getBean(Worker.class);

        worker.work("Walk");

        worker.rest();

        worker.sleep();

    }
}
