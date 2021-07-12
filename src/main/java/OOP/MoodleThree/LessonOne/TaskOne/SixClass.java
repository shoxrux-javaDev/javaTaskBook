package OOP.MoodleThree.LessonOne.TaskOne;

import java.util.Scanner;

public class SixClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test t1=new Test(DemoSix.MALE);
        String name = "Nodir";
        String name1 = "Lobar";
        System.out.println("User is Nodir and Lobar");
        System.out.println("Choose the six of people:");
        System.out.println("1."+DemoSix.MALE+"2."+DemoSix.FEMALE);
        OrderSix(scanner);
    }

    public static void OrderSix(Scanner scanner) {
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nodir is "+DemoSix.MALE);
                break;
            case 2:
                System.out.println("Lobar is "+DemoSix.FEMALE);
                break;
        }
    }


}
