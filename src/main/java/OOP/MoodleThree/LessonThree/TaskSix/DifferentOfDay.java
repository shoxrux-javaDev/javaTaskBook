package OOP.MoodleThree.LessonThree.TaskSix;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class DifferentOfDay {
    public static void main(String[] args) {

        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalDate date1 = LocalDate.parse("2021-06-23");
        System.out.println(date1);
        countDifferenOfDay(date,date1);


    }

    private static void countDifferenOfDay(LocalDate date,LocalDate date1) {

        System.out.println("ikki sananing kunlardagi farqi: "+DAYS.between(date, date1)+" kunga teng");
    }
}
