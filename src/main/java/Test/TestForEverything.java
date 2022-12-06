package Test;

public class TestForEverything {
    public static void main(String[] args) {
//
//        String myString = "123";
//        int foo;
//        try {
//            foo = Integer.parseInt(myString);
//            System.out.println(myString);
//
//        }
//        catch (NumberFormatException e) {
//            foo = 0;
//            System.out.println("Exception");
//        }



        addingNumTest1(10,0);

    }



//    public static <T1, T2> void addingNumTest1(T1 num1, T2 num2) { // Раблтает на все операции стр стр, стр инт
//        try {
//            Integer i2 = Integer.valueOf(String.valueOf(num1));
//            Integer i3 = Integer.valueOf(String.valueOf(num2));
//            System.out.println(i2);
//            System.out.println(i3);
//            Object result = i2 - i3;
//            System.out.println(result);
//        } catch (NumberFormatException e) {
//            System.err.println("Неправильный формат строки!");
//        }
//    }


    public static <T extends Object> void addingNumTest1(T num1, T num2) { // Раблтает на все операции стр стр, стр инт
        try {
            Integer i2 = Integer.valueOf(String.valueOf(num1));
            Integer i3 = Integer.valueOf(String.valueOf(num2));
            System.out.println(i2);
            System.out.println(i3);
            Object result = i2 / i3;
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
    }
//    ArithmeticException // исключение деление на 0
//            NumberFormatException



//public static <T1, T2, T3> void addingNumTest(T1 num1, T2 num2){
//        T1 i1 = num1;
//        T2 i2 = num2;
//        Object result;
//     if ( i1 == Integer.valueOf(String.valueOf(num1)) &  i2 == Integer.valueOf(String.valueOf(num2))){
//         System.out.println(i1 + i2);
//     }
//}


//
//    public static <T1, T2> void valueOf (String str, T1 num1, T2 num2) {
//        Format parser = NumberFormat.getInstance();
//        try {
//            Object obj = parser.parseObject(str);
//            if (obj instanceof Double) {
//                System.out.println("double");
//            } else if (obj instanceof Long) {
//                int i = (Integer) num1 + (Integer) num2;
//                System.out.println(i);
//                System.out.println("long");
//            } else {
//                new ParseException("WTF?", 0);
//            }
//        } catch (ParseException pe) {
//            throw new IllegalArgumentException("Illegal value: " + str);
//        }
//    }





//    public static <T1, T2, T3> void addingNumTest(T1 num1, T2 num2){
//        T3 sum1 = (T3) num1;
//        T3 sum2 = (T3) num2;
//        int res;
//        if (sum1 == Integer.valueOf(String.valueOf(num1)) & sum2 == Integer.valueOf(String.valueOf(num2))){
//           res = (Integer)sum1 + (Integer) sum2;
//            System.out.println(res);
//        }
//    }



}
