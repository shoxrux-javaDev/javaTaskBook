package OOP.MoodleThree.LessonThree.TaskThree;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class CalculateOfUserAge {
    public static void main(String[] args) {

        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        LocalDate localDate1 = LocalDate.of(1996, 3, 9);
        LocalDate differenceOfYears = localDate.minus(localDate1.getYear(), ChronoUnit.YEARS);
        LocalDate differenceOfMonth = localDate.minus(localDate1.getMonthValue(), ChronoUnit.MONTHS);
        LocalDate differenceOfDay = localDate.minus(localDate1.getDayOfMonth(), ChronoUnit.DAYS);
        System.out.println(" it's been "+differenceOfYears.getYear()+" years " +differenceOfMonth.getMonthValue()+
                           " month "+ differenceOfDay.getDayOfMonth()+ " days " + "since you were born");

        //Bu vaqtni yaxlitlab yuborishda kerak bo'ladi yani pasda minutni yaxlitlab yubordik sekundni hisobga olmadik
        /*TemporalUnit temporalUnit = ChronoUnit.MINUTES;
        LocalTime localTime1 = localTime.truncatedTo(temporalUnit);
        System.out.println(localTime1);*/

    }
}
