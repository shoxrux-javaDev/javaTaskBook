package OOP.MoodleThree.LessonThree.TaskFive;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class RemainMonth {
    public static void main(String[] args) {

        LocalDate localDate=LocalDate.now();

        int monthValue =12-localDate.getMonthValue();
        System.out.println("qolgan oy :"+monthValue);


    }
}
