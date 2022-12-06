package DZ11LambdaExpressions;

public class Main {
    public static void main(String[] args) {

//        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5);
        int[] myIntArray = new int[]{1, 2, 3, 4, 5};
//        Optional<Integer> result = numbersStream.reduce((x, y)->x+y);
//        System.out.println(result.get());

        TwoArgIntOperator addTwoInts = (a, b) -> a + b;
        reduce(myIntArray, addTwoInts);



    }
    static void reduce(int[] al, TwoArgIntOperator operator) {
        int p = 0;
        for (int i = 0; i < al.length; i++){

            System.out.println(p = p + al[i]);
        }

    }
    public interface TwoArgIntOperator {
        public int op(int a, int b);

    }
}


// написать метод высшего порядка reduce (пишем свою, не пользуемся готовым),
// которая принимает лямбду принимающую два аргумента и массив типа int.
//
//метод должен выполнить указанную лямбду на переданном массиве таким образом:
//
//пример лямбды: (x, y) -> x + y
//пример массива [1, 2, 3, 4, 5]
//результат 15
//
//пример работы:
//1 шаг: В лямбду передается x=1, y=2 результат 3
//2 шаг: В лямбду передается x=3 (результат предыдущего вызова функции), y=3 результат 6
//3 шаг: В лямбду передается x=6 (результат предыдущего вызова функции), y=4 результат 10
//4 шаг: В лямбду передается x=10 (результат предыдущего вызова функции), y=5 результат 15
//
//таким образом результатом работы reduce стало 15
//
//должно работать с разными лямбдами, принимающими 2 аргумента и разными массивами типа int