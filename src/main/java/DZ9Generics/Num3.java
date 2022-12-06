package DZ9Generics;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Num3 {
    public static void main(String[] args) {
//        int qwe [] = {77,1,234,2,34,4,55,23324,453,};
//        System.out.println(Arrays.toString(shuffle(new Integer[]{1,2,3,4})));
//        System.out.println(Arrays.toString(shuffle(new String[]{"a","b","c"})));


//        List<Integer>integerList = new ArrayList<>();
//        List<String>arrayList = new ArrayList<>();
//        List<Double>doubleArrayList = new ArrayList<>();
//        showList(integerList);
//        showList(arrayList);
//        showList(doubleArrayList);


        Random rand = new Random();

        System.out.println("Integer");

        List<Integer>integerList = new ArrayList<>();
        for (int i = 0; i <= 100; i ++){
            integerList.add(rand.nextInt(100)+1);
        }
        showList(integerList);

        System.out.println("double");

        List<Double>doubleArrayList = new ArrayList<>();
        for (int i = 0; i <= 100; i ++){
            doubleArrayList.add((double) (rand.nextInt(100)+1));
        }
                showList(doubleArrayList);

        System.out.println("String");

        List<String>arrayList = new ArrayList<>();
        for (int i = 0; i <= 100; i ++){
            arrayList.add(String.valueOf((rand.nextInt(100)+1)));
        }
        showList(arrayList);


//        List<Integer> integerList = IntStream.range(0, 100)
//                .mapToObj(i -> rand.nextInt(100))
//                .collect(Collectors.toList());
//
//        System.out.println(list11);


    }
//    static <T> T[] shuffle(T[] arr){
//
//        Random rnd = new Random();
//        for (int i = arr.length - 1; i > 0; i--) {
//            int index = rnd.nextInt(i + 1);
//            T a = arr[index];
//            arr[index] = arr[i];
//            arr[i] = a;
//        }
//        return arr;
//    }



    static void showList(List<?>list){
//        Random rand = new Random();
//
//        List list11 = IntStream.range(0, 100)
//                .mapToObj(i -> rand.nextInt(100))
//                .collect(Collectors.toList());

        System.out.println(list);
    }

}
//#3 Реализовать метод, который принимает на вход список элементов любого типа данных,
//создает список из 100 элементов заполненный элементами из переданного списка в случайном порядке
// (Загуглить "генерация случайных чисел Java")