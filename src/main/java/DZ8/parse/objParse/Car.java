package DZ8.parse.objParse;
import DZ8.parse.Person;

import java.io.*;


public  class Car implements Serializable {
    static final long serialVersionUID = 1l;
     int speed;
     String color;

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public Car() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//    File file = new File("fileSerial");

    public void writeTOFile () throws IOException {
        FileOutputStream fOut = new FileOutputStream("fileSerial",true);
        ObjectOutputStream objOut = new ObjectOutputStream(fOut);
        objOut.writeObject(new Car(100,"Green"));
        objOut.close();
        fOut.close();

    }

    public static void readFromFile () throws ClassNotFoundException, IOException {
        FileInputStream fInput = new FileInputStream("fileSerial");
        ObjectInputStream objInput = new ObjectInputStream(fInput);
        Car dObj = (Car) objInput.readObject();
        System.out.println(dObj);
        objInput.close();
        fInput.close();
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
//  Реализовать класс Car, с полями присущими автомобилю (скорость, цвет и тд).
//  Создать метод, который бы сохранял указанный объект на диск и статический метод класса,
//  который бы читал файл и создавал объект