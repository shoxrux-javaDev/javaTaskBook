package OOP.MoodleThree.LessonThree.TaskFour;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;


public class ScreenSunday {

    public static void main(String[] args) {

        LocalDate localDate=LocalDate.now();
        DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("yyyy.MM.dd");
        System.out.println("hozirgi sana :"+dateFormatter.format(localDate));
        showBeforeSunday(localDate,dateFormatter);
        showAfterSunday(localDate,dateFormatter);

//        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
//        System.out.println(beginningOfDay);
//        LocalDate localDate1 = LocalDate.minus(1).with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
    }

    private static void showAfterSunday(LocalDate localDate,DateTimeFormatter dateFormatter) {
        LocalDate nextSunday = localDate.plusWeeks(1).with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        System.out.println("Kegingi hafta yakshanba:   ("+dateFormatter.format(nextSunday)+")" +
                           "    shu sanaga to'g'ri kelgan edi");

    }

    private static void showBeforeSunday(LocalDate localDate,DateTimeFormatter dateFormatter) {
        LocalDate lastSunday = localDate.minusWeeks(1).with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        System.out.println("O'tgan hafta yakshanba:    ("+dateFormatter.format(lastSunday)+")    shu sanaga to'g'ri kelgan edi");
    }
}
