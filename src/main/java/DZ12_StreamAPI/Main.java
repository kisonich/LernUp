package DZ12_StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInt = Stream.of(1, 11, 20, 30, 40 ).collect(Collectors.toList());
        List<String> listInt2 = Stream.of("1", "11", "20", "30", "40" ).collect(Collectors.toList());
        System.out.println(listInt2.get(1) + listInt2.get(2));
        System.out.println(listInt);
        System.out.println(listInt2);


        IntStream intStream = IntStream.range(0, 111);
//        intStream.forEach(System.out::println);
        intStream
                .filter(e -> e % 2 == 0)
                .limit(9)
                .forEach(System.out::println) ;
    }
}


//Потренироваться использовать стримы.
//
//Взять строковый и числовые наборы данных и применить к ним максимально возможное количество
// нетерминальных операций
//
//Выполнить преобразования результата из стрима в списки