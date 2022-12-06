package DZ13Reflection_API;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
//        serialize();
//        deserialize();

        Item item1 = new Item(1L, "Name1", 101.00);
        Map<String, Object> serialized = item1.serialize();
        System.out.println(serialized);
    }

    public void item(Map<String, Object> data) throws Exception {
        for (Field f : Item.class.getDeclaredFields())
            f.set(this, data.get(f.getName()));
    }





//    public static void serialize(){
//        Item item = new Item(1L,"Pen", 12.55);
//        System.out.println("Before Serialization" + item);
//        FileOutputStream fileOut;
//        try {
//            fileOut = new FileOutputStream("item.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(item);
//            out.close();
//            fileOut.close();
//            System.out.println("Serialized data is saved in item.ser");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    public static void deserialize(){
//        Item item;
//        try {
//            FileInputStream fileIn = new FileInputStream("item.ser");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            item = (Item) in.readObject();
//            System.out.println("Serialized data is read from item.ser");
//            System.out.println("After Deserialization" + item);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

}
//Сабтайтл: сериализация через рефлексию
//
//Создайте новый проект. Напишите статический метод сериализации (и десериализации),
// который принимает сериализуемый объект и ObjectOutputStream и сериализует его туда.
// При этом сам объект может быть несериализуемого типа (проверяйте это наличием маркерного интерфейса
// сериализации, делайте это через рефлекшены, посмотрите каким методом у Class это можно сделать по
// аналогии с тем что делали на лекции), как и его поля, потому вам надо продумать рекурсивный алгоритм
// сериализации - вызывая себя для несериализуемых полей и используя стандартную сериализацию для сериализуемых.
// Продемонстрируйте работу этих методов в main (рекурсивность в примере должна присутствовать).
// На проблему версий классов (то что решается в стандартной сериализации через serial version) можно внимания не обращать.
// Также граф сылок объектов друг на друга можно считать ацикличным
// (т.е. не будет такого что объект A ссылается на объект B, B на C, а C опять на A)