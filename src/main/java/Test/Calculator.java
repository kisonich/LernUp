package Test;



class Calculator {
    public static void main(String[]args){
        addingNum(10,"5");
    }
    public static <T1, T2, T3> void addingNum(T1 num1, T2 num2) {
        T3 sum1 = (T3) num1;
        T3 sum2 = (T3) num2;
        try {
            Object res;
            if (sum1 == Integer.valueOf(String.valueOf(num1)) || sum2 == Integer.valueOf(String.valueOf(num2))){
                res = (Integer)sum1 + (String) sum2;
                System.out.println(res);
            }
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
    }
}
//#1 Создать класс для математических вычислений:
//Содержит 4 статических метода на сложение, вычитание, умножение, деление.
//Обработать ошибку деления на ноль.