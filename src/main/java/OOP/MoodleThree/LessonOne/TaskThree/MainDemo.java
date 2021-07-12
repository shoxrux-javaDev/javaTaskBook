package OOP.MoodleThree.LessonOne.TaskThree;
import java.util.Scanner;
public class MainDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("              Windows...        ");
        System.out.println("      1."+WindowUser.ADMIN+"   2."+WindowUser.USER+"   3."+WindowUser.GUEST);
        String number = scanner.nextLine();
        if (number.equals("1")) {
            System.out.println("Welcome "+WindowUser.ADMIN.getName());
        } else if (number.equals("2")) {
            System.out.println("Welcome "+WindowUser.USER.getName());
        } else if (number.equals("3")) {
            System.out.println("Welcome "+WindowUser.GUEST.getName());
        }
    }
}
