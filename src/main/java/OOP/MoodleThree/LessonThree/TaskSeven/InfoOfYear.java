package OOP.MoodleThree.LessonThree.TaskSeven;

import java.time.LocalDate;
import java.util.Scanner;

public class InfoOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate localdate = LocalDate.now();
        System.out.println("Joriy yil :" + localdate.getYear());
        if (localdate.isLeapYear())
            System.out.println(localdate.getYear() + " bu yil kabisa yili");
        System.out.println(localdate.getYear() + "bu yil kabisa yili emas");
        System.out.println("Yilning davomiyligi " + localdate.lengthOfYear()+" kunga teng");


    }
}
