package  dz17;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.println("Hello world!");
        URL resource = Main.class.getResource("1.txt");
        System.out.println(resource);
        Files.readAllLines(Path.of(resource.toURI())).forEach(System.out ::println);

        User user = new User(1 , "Ivar");
        User user2 = new User(2 , "Lodabrak");
        Gson gson = new Gson();
//        System.out.println(gson.toJson(user)); // суриализация
         String json = gson.toJson(user2);
//        System.out.println(json);

        System.out.println(gson.fromJson(json, User.class));



    }
}
