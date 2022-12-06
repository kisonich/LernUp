package DZ9Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mathematics.addingNumTest1(1,5);

//#2 Создать дженерик класс User, у которого поля id, card_number могут иметь типы String или int
            User user= new User("1",11.345);

            user.getInfo222("2", "user_clark : 12.665");
            user.getInfo(3, "user_clark : 13.924");
            System.out.println(user);
//#2 Создать дженерик класс User, у которого поля id, card_number могут иметь типы String или int

        }
}
// #1 Создать класс для математических вычислений: 4 статических метода на сложение, вычитание, умножение, деление.
class  Mathematics <M> {
    M naum1;
    M naum2;

    public M getNaum1() {
        return naum1;
    }

    public void setNaum1(M naum1) {
        this.naum1 = naum1;
    }

    public M getNaum2() {
        return naum2;
    }

    public void setNaum2(M naum2) {
        this.naum2 = naum2;
    }

    public Mathematics(M naum1, M naum2) {
        this.naum1 = naum1;
        this.naum2 = naum2;
    }

    public Mathematics() {
    }
    //    public static <T> void addingNum(T num1, T num2) {
//
//        int myArray[] = {3, 5, 7, 12};
//        List<?> list = new ArrayList<>();
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            sum = sum + myArray[i];
//        }
//        System.out.println(sum);
//    }

    public static <T1, T2, T3> void addingNumTest1(T1 num1, T2 num2) { /////Работает!!!!!
        T3 sum1 = (T3) num1;
        T3 sum2 = (T3) num2;
        try {
            Object res;
            if (sum1 == String.valueOf(num1) & sum2 == Integer.valueOf(String.valueOf(num2))){
                res = (String)sum1 + (Integer) sum2;
                System.out.println(res);
            }

        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
    }





}
//#1 Создать класс для математических вычислений: 4 статических метода на сложение, вычитание, умножение, деление.

//#2 Создать дженерик класс User, у которого поля id, card_number могут иметь типы String или int
  class User<T> {
    T id;
    T card_number;
    public User(T id, T card_number) {
        this.id = id;
        this.card_number = card_number;
    }
    // getter and setter ////////////////
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", card_number=" + card_number + '}';
    }
    public static  <T> void getInfo(T id, T card_number){
        System.out.println(id +","+ card_number);
    }
    public <T> void getInfo222(T id, T card_number){
        System.out.println(id +","+ card_number);
    }
}
//#2 Создать дженерик класс User, у которого поля id, card_number могут иметь типы String или int

//#1 Создать класс для математических вычислений:
//Содержит 4 статических метода на сложение, вычитание, умножение, деление.
//Обработать ошибку деления на ноль.
//Методы должны быть Generic и принимать данные в разных форматах (строка, число)
//#2 Создать дженерик класс User, у которого поля id, card_number могут иметь типы String или int
//#3 Реализовать метод, который принимает на вход список элементов любого типа данных,
//создает список из 100 элементов заполненный элементами из переданного списка в случайном порядке
// (Загуглить "генера   ция случайных чисел Java")