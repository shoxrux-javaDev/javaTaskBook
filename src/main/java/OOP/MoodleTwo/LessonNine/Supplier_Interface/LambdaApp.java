package OOP.MoodleTwo.LessonNine.Supplier_Interface;

import java.util.Scanner;
import java.util.function.Supplier;

public class LambdaApp {


    public static void main(String[] args) {

        showInfo("Shoxruh");

        Supplier<User> userSupplier = new Supplier<User>() {
            @Override
            public User get() {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите имя: ");
                String name = in.nextLine();
                return new User(name);
            }
        };

        User user = userSupplier.get();
        User user2 = userSupplier.get();
        if (user.getName().equals(user2.getName()))
            System.out.println(user);

            /*Supplier<User> userFactory = ()->{
                Scanner in = new Scanner(System.in);
                System.out.println("Введите имя: ");
                String name = in.nextLine();
                return new User(name);
            };
            User user1 = userFactory.get();
            User user2 = userFactory.get();
            System.out.println("Имя user1: " + user1.getName());
            System.out.println("Имя user2: " + user2.getName());*/
    }

    public static void showInfo(String name) {
        System.out.println(name);
    }
}

