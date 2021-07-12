package OOP.MoodleThree.LessonTwo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ForTrain {
    public static void main(String[] args) {
        Date date =new Date();
        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);

        System.out.println("Day of week: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of year: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Week in Month: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Week in year: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Day of week in Month: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.getTime());

        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("MILLI SECOND: " + calendar.get(Calendar.MILLISECOND));
        System.out.println("AM OR PM: " + calendar.get(Calendar.AM_PM));
        System.out.println("Hour (24-hour clock) : " + calendar.get(Calendar.HOUR_OF_DAY));
        DateFormat dateFormat = new SimpleDateFormat("'Bugungi sana:' dd.MM.yyyy 'Vaqt: ' hh:mm");
        System.out.println(dateFormat.format(date));
//        DateFormat


    }
}
