package OOP.MoodleThree.LessonThree.TaskTwo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DifferentTime {
    public static void main(String[] args) {

        LocalTime localTime=LocalTime.now();
        LocalTime localTime1=LocalTime.of(3,35,45,487189874);
        System.out.println("First time: "+localTime+"\n"+"Second time: "+localTime1);
        LocalTime hoursOfMultiply = localTime.minus(localTime1.getHour(), ChronoUnit.HOURS);
        LocalTime minutesOfMultiply = localTime.minus(localTime1.getMinute(), ChronoUnit.MINUTES);
        LocalTime secondsOfMultiply = localTime.minus(localTime1.getSecond(), ChronoUnit.SECONDS);
        LocalTime nanosOfMultiply = localTime.minus(localTime1.getNano(), ChronoUnit.NANOS);
        System.out.println("Multiply of hours: "+hoursOfMultiply);
        System.out.println("Multiply of minutes: "+minutesOfMultiply);
        System.out.println("Multiply of seconds: "+secondsOfMultiply);
        System.out.println("Multiply of nanoseconds: "+nanosOfMultiply);


//        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
//        System.out.println(firstDayOfMonth);

    }
}
