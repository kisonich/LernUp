package DZ14_Multithreading;

import java.util.Scanner;

public class Main {

    void pow(int value, int powValue) throws InterruptedException {

            System.out.println("Идут расчеты...");
        Thread.sleep(3000);
        System.out.println("Подождите Немного..");
        Thread.sleep(2000);
        System.out.println("Результат :"+"Числа " + value + " в степени "+ powValue);
            System.out.println(Math.pow(value,powValue));
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyThreadPow());
        System.out.println("Введите value and powValue");
        thread1.start();
    }
}

class MyThreadPow implements Runnable {
    public void run() {
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();
    int powValue = scanner.nextInt();
        System.out.println("Введены чилса : " + value + " ^"+ powValue );
        try {
            new Main().pow(value,powValue);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
// Создать программу, для параллельных вычислений.
// Для имитации долгих расчетов можно использовать sleep. Необходимо создать скрипт принимающий на вход число и его степень,
// и затем выполняющий операцию возведения. Необходимо реализовать выполнения операции в много поточном режиме,
// при этом главный поток программы должен отображать меню и запрашивать новые данные,
// и создавать новые потоки на возведение в степень