package DZ14_Multithreading_2;
public class Main extends Thread{
    public static void main(String[] args){

        int[] firstArr ={1000};
        int[] secondArr ={1000};
        int[] thirdArr ={1000};

        new Thread(new Runnable(){ // Анонимный класс.
            public void run(){
                initializeArr(firstArr,1,100);
            } })/* Анонимный класс */.start();


        new Thread(() ->  initializeArr(secondArr,101,200)).start();

        Thread thread3 = new Main();
        initializeArr(thirdArr,201,300);
        thread3.start();

    }
    public static void initializeArr(int[] arr, int numStart, int numEnd){
        System.out.println(Thread.currentThread().getName() +" Hi Thread !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        for (int i = numStart; i <=numEnd; i++)
            System.out.println(i);
        System.out.println(Thread.currentThread().getName()+ " Thread ends !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}

//Напишите многопоточную программу, которая заполняет 3 массива данными.
//
//Сначала создайте 3 массива целых чисел длины 1000. Ваша задача - заполнить первый массив числами от 1 до 1000,
// второй от 1001 до 2000 и третий от 2001 до 3000.
//Нужно пройтись тремя циклами и записать эти значения. Эту работу можно делать параллельно для трех массивов:
// создайте три потока тремя разными способами (с помощью анонимного класса, лямбда-функции и явного наследования от Thread,
// определяя метод run() во всех случаях) и распараллельте эти циклы, используя созданные потоки.
// Каждый поток после выполнения работы должен выводить на экран сообщение о том, что он завершился, заполнив первый/второй/третий массив.
//Запустите 3 потока паралленльно несколько раз и убедитесь, что порядок исполнения может различаться от запуска к запуску,
// что наглядно демонстрируется порядком вывода фраз о завершении на экран.