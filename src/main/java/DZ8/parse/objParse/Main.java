package DZ8.parse.objParse;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Car car = new Car();

        car.writeTOFile();
        car.readFromFile();

//            try {
//                FileOutputStream fos = new FileOutputStream("fileSerial");
//                ObjectOutputStream oos = new  ObjectOutputStream(fos);
////                oos.writeObject(new Car(40,"black"));
//                oos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
////////////////////////////////////////////////////////////////
//        File file = new File("fileSerial");
//
//        ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream(file));
//        oos.writeObject(new Car(150,"black"));
//        oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        Car car = (Car) ois.readObject();
//        System.out.println(car);
//        ois.close();
    }
}
