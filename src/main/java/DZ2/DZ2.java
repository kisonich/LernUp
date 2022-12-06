package DZ2;

import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int month = input.nextInt(); //Чтобы получить введенное число, используется метод in.nextInt();, который возвращает введенное с клавиатуры целочисленное значение.
        int month = monthValidation(input);

        String seasonWinter = "season is Winter";
        String seasonAutumn = "season is Autumn";
        String seasonSummer = "season is Summer";
        String seasonSpring = "season is Spring";

        StringBuilder sbIf = new StringBuilder();
        sbIf.append(" from the operator if");
        StringBuilder sbSwitch = new StringBuilder();
        sbSwitch.append(" from the operator Switch");

        if (month == 1){
            System.out.println("Month = " + month + " January " + seasonWinter + sbIf);
        }else if (month == 2){
            System.out.println("Month = " + month + " February " + seasonWinter + sbIf);
        }else if (month == 3){
            System.out.println("Month = " + month + " March " + seasonAutumn + sbIf);
        }else if (month == 4){
            System.out.println("Month = " + month + " April " + seasonAutumn + sbIf);
        }else if (month == 5){
            System.out.println("Month = " + month + " May " + seasonAutumn +  sbIf);
        }else if (month == 6){
            System.out.println("Month = " + month + " June " + seasonSummer + sbIf);
        }else if (month == 7){
            System.out.println("Month = " + month + " July " + seasonSummer + sbIf);
        }else if (month == 8){
            System.out.println("Month = " + month + " August " + seasonSummer + sbIf);
        }else if (month == 9){
            System.out.println("Month = " + month + " September " + seasonSpring + sbIf);
        }else if (month == 10){
            System.out.println("Month = " + month + " October " + seasonSpring + sbIf);
        }else if (month == 11){
            System.out.println("Month = " + month + " November " + seasonSpring + sbIf);
        }else if (month == 12){
            System.out.println("Month = " + month + " December " + seasonWinter + sbIf);
        }

        switch (month){
            case 1:
                System.out.println("Month = " + month + " January " + seasonWinter + sbSwitch);
                break;
            case 2:
                System.out.println("Month = " + month + " February " + seasonWinter + sbSwitch);
                break;
            case 3:
                System.out.println("Month = " + month + " March " + seasonAutumn + sbSwitch);
                break;
            case 4:
                System.out.println("Month = " + month + " April " + seasonAutumn + sbSwitch);
                break;
            case 5:
                System.out.println("Month = " + month + " May " + seasonAutumn + sbSwitch);
            case 6:
                System.out.println("Month = " + month + " June " + seasonSummer + sbSwitch);
                break;
            case 7:
                System.out.println("Month = " + month + " July " + seasonSummer + sbSwitch);
                break;
            case 8:
                System.out.println("Month = " + month + " August " + seasonSummer + sbSwitch);
                break;
            case 9:
                System.out.println("Month = " + month + " September " + seasonSpring + sbSwitch);
                break;
            case 10:
                System.out.println("Month = " + month + " October " + seasonSpring + sbSwitch);
                break;
            case 11:
                System.out.println("Month = " + month + " November " + seasonSpring + sbSwitch);
                break;
            case 12:
                System.out.println("Month = " + month + " December " + seasonWinter + sbSwitch);
                break;
        }
    }
    private static int monthValidation(Scanner input) {
        int numberValidate;
        System.out.println("Enter integer corresponding to the number of the calendar month (1 - 12)");

        while (!input.hasNextInt() || (numberValidate = input.nextInt()) > 12 || numberValidate < 1) {
            input.nextLine();
            System.out.println("Incorrect data entered, try again");
        }
        return numberValidate;
    }
}
// 1) Написать программу определяющую по значению переменной время года.
// Решение представить с использованием операторов if и switch (2 варианта).
// Сделать проверку данных на корректность (месяцы 1 -12)

