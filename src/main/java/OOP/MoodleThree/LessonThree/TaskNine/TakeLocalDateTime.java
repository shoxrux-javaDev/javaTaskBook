package OOP.MoodleThree.LessonThree.TaskNine;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TakeLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
       /* LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("Umumiy matn: " + localDateTime);
        System.out.println("sana: " + localDate);
        System.out.println("vaqt: " + localTime);*/

        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("hh:mm:ss");

        System.out.println(formatterDate.format(localDateTime));
        System.out.println(formatterTime.format(localDateTime));


    }
}
