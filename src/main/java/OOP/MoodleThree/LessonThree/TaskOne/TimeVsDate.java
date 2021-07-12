package OOP.MoodleThree.LessonThree.TaskOne;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeVsDate {

    public static void main(String[] args) {
        LocalDate localDate =LocalDate.now();
//        LocalDateTime local=LocalDateTime.now();
//        System.out.println(local);
        LocalTime localTime =LocalTime.now();
        dateWithoutDay(localDate);
        dateWithoutHour(localTime);
    }

    public static void dateWithoutHour(LocalTime localTime) {
        System.out.println("hozirgi vaqt ="+localTime);
    }

    public static void dateWithoutDay(LocalDate localDate) {
        System.out.println("hozirgi sana ="+localDate);
    }
}
