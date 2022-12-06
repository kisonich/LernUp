package DZ8.parse.consoles;

import java.io.*;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("log.txt");

        //Используем Scanner для чтения того, что введет пользователь.
        Scanner scanner = new Scanner(System.in);
        //Используем PrintWriter для того, чтобы писать в файл
        System.out.println("Enter yor firstname and last name");
        try(PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(
                        //Второй параметр true - значит не перезаписываем содержимое файла,
                        //а дописываем в него
                        new FileOutputStream(file, true)))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                    //Если пользователь ввел exit - завершаем программу
                    if("q".equals(line)) {
                        return;
                    }
                    //Пишем в файл то, что ввел пользователь
                    writer.println(line);
            }
        }
    }
}
