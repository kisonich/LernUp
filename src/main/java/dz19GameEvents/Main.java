package dz19GameEvents;

import dz19GameEvents.events.FinishGameEvent;
import dz19GameEvents.events.StartGameEvent;
import dz19GameEvents.events.WrongAnswerGameEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Random;
import java.util.Scanner;

/*
20. Spring Boot и Java-based конфигурация
Задание из урока 19 делаем на Spring Boot
 */

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        // событие, начало игры
        context.publishEvent(new StartGameEvent(context));

        Random random = new Random();
        int result = random.nextInt(1000);

        Scanner sc = new Scanner(System.in);

        boolean finishFlag = false;

        while (!finishFlag) {

            int answer = sc.nextInt();

            if (result == answer) {
                context.publishEvent(new FinishGameEvent(context, answer));
                finishFlag = true;
            } else {
                context.publishEvent(new WrongAnswerGameEvent(context, result, answer));
            }
        }


    }
}
