package OOP.MoodleTwo.LessonNine.TaskOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ixtiyoriy son kiriting: ");
        int ints = scanner.nextInt();

        Lambda_Sign sign = (a) -> {
            if(a>0){
                System.out.println(a+" musbat son");
            }else{
                System.out.println(a+" manfiy son");
            }
        };
        sign.ints(ints);
    }
}
