package DZ9Generics;

import java.util.ArrayList;
import java.util.List;

public class wq  {
    public static void main(String[] args) {
        Matimat<Integer,String> adding = new Matimat(123, 123);
        System.out.println(adding.toString());



        adding.addingNum(123,123);
//        Matimat.addingNum("asdasdas", "12312321");
//        Matimat.addingNum(5,10 + 2);
    }
}
class Matimat <V1, V2> {
    private V1 num1;
    private V2 num2;

    public Matimat(V1 num1, V2 num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public V1 getNum1() {
        return num1;
    }

    public V2 getNum2() {
        return num2;
    }

public static <V1, V2, T> void addingNum(V1 num1, V2 num2){


}
    @Override
    public String toString() {
        return "Matimat{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

}


//#1 Создать класс для математических вычислений:
//Содержит 4 статических метода на сложение, вычитание, умножение, деление.
//Обработать ошибку деления на ноль.
//Методы должны быть Generic и принимать данные в разных форматах (строка, число)