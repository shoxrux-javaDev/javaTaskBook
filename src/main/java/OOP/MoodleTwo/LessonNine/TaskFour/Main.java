package OOP.MoodleTwo.LessonNine.TaskFour;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ixtiyoriy son kriting:(0 exit)");
        while (true) {
            int number = scanner.nextInt();
            Number_Comparison_Of_Massiv num = (a) -> a == number;
            int[] ints = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
            boolean number1 = check(num, ints);
            if (number1) {
                System.out.println(number + " massivda mavjud");
            } else if(number==0) {
                return;
            }else{
                System.out.println(number + " massivda mavjud emas!");
            }
        }
    }
    public static boolean check(Number_Comparison_Of_Massiv num, int[] ints) {
        boolean count = false;
        for (int item : ints) {
            if (num.isEqual(item)) {
                count = true;
                break;
            }
        }
        return count;
    }
}