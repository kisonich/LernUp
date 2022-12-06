package DZ3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


////////////////// 1) квадраты чисел от 1 до 25.////////////////////
//        for (int i = 1; i <= 25; i++)
//            System.out.println(i * i);

        for ( int j = 1; j <= 25; j++ )
            System.out.println( (int) Math.pow( j, 2 ) );
//////////////////// 1) квадраты чисел от 1 до 25.////////////////////

///////////////// 2) делятся на 3 и не делятся на 9 на цело./////////////
//        int passArray[] = new int[1000];
        for(int i =100; i < 1000; ++i) {
            if (i%3==0 && i%9!=0){
                System.out.println(i);
            }
        }
///////////////// 2) делятся на 3 и не делятся на 9 на цело./////////////

///////////////// 3) Найти сумму матриц./////////////

        int firstArr [] [] = {{1,2,3},
                                {1,2,4}};

        int secondArr [] [] = {{3,3,1},
                                {5,9,6}};

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < firstArr[i].length; j++) {
                sum1 += firstArr[i][j];
                System.out.println(sum1);
            }
        }
        System.out.println("Second Array");
        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < secondArr[i].length; j++) {
        sum2 += secondArr[i][j];
        System.out.println(sum2);
            }
        }

        int finishSum = sum1 + sum2;
        System.out.println(finishSum + " Sum of two arrays");
///////////////// 3) Найти сумму матриц./////////////

///////////////// 4) Сортировка пузырьком./////////////
        int [] arr = {11, 3, 14, 16, 7, 4, 13,25, 1, 8};

        boolean sorted = false;
        int var;

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    sorted = false;

                    var = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = var;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
///////////////// 4) Сортировка пузырько./////////////

    }
}
// тернарный условный оператор String securityAnswer = man.getAge() >= 18 ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";

// 1) Составьте программу, выводящую на экран квадраты чисел от 1 до 25.
//2) Даны числа от 100 до 1000. Вывести числа, которые делятся на 3 и не делятся на 9 на цело.
//3) Даны две матрицы (два двумерных int массива одинаковой размерности). Найти сумму матриц
//4) Реализовать алгоритм сортировки пузырьком для массива типа int
