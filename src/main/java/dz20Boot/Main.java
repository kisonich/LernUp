package dz20Boot;

import dz19GameEvents.events.FinishGameEvent;
import dz19GameEvents.events.StartGameEvent;
import dz19GameEvents.events.WrongAnswerGameEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Random;
import java.util.Scanner;

/*
В игре угадайка компьютер генерирует случайное число от 0 до 1000. Далее пользователю предлагается угадать это число.
 Пользователь вводит числа с консоли, а компьютер отвечает твое число меньше, твое число больше или поздравляю ты угадал я загадал число Х.

Реплики:
Привет, я загадал число, попробуй его отгадать!
Делай попытку, можно вводить числа от 0 до 1000!
Мое число побольше твоего
Мое число меньше твоего
Ты угадал, я загадал число Х

Реплики делаем с применением локализации спринга на русском и английском!

Для общения использовать инструменты публикаторов и слушателей событий. То есть сделать игру на Spring Events.
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
