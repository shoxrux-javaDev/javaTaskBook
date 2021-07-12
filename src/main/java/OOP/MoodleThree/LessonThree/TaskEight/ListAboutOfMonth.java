package OOP.MoodleThree.LessonThree.TaskEight;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;

public class ListAboutOfMonth {
    public static void main(String[] args) {

        LocalDate localdate=LocalDate.of(2020,02,03);

        System.out.println("Sequence of month: "+localdate.getMonthValue());
        System.out.println("duration of the month: "+localdate.lengthOfMonth());
        System.out.println("maximum duration of month: " + Month.of(localdate.getMonthValue()).maxLength());
        System.out.println("kvartalning 1 oyi: " + Month.of(localdate.getMonthValue()-1).firstMonthOfQuarter());
        System.out.println("name of month: "+localdate.getMonth());


    }
}
