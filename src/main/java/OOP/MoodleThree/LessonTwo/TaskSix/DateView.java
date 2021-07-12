package OOP.MoodleThree.LessonTwo.TaskSix;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;

public class DateView {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format2 = new SimpleDateFormat("yy/MM/dd h:mm a");
        SimpleDateFormat format3 = new SimpleDateFormat("h:mm:ss a");
        SimpleDateFormat format4 = new SimpleDateFormat("MMdd,yyyy h:mm:ss a");
        SimpleDateFormat format5 = new SimpleDateFormat("h:mm a");
        SimpleDateFormat format6 = new SimpleDateFormat("h:mm:ss a");
        SimpleDateFormat format7 = new SimpleDateFormat("h:mm:ss a z");
        SimpleDateFormat format8 = new SimpleDateFormat("yy/MM/dd h:mm a");
        SimpleDateFormat format9 = new SimpleDateFormat("MMdd,yyyy h:mm a");
        SimpleDateFormat format10 = new SimpleDateFormat(" d,yyyy h:mm:ss a z");
        int count = 1;
        calendar.set(2003, Calendar.NOVEMBER, 4, 20, 14, 11);
        System.out.println("1." + calendar.getTime());
        System.out.println("2." + format2.format(calendar.getTime()));
        System.out.println("3." + format3.format(calendar.getTime()));
        System.out.println("4." + format4.format(calendar.getTime()));
        System.out.println("5." + format5.format(calendar.getTime()));
        System.out.println("6." + format6.format(calendar.getTime()));
        System.out.println("7." + format7.format(calendar.getTime()));
        System.out.println("8." + format8.format(calendar.getTime()));
        System.out.println("9." + format9.format(calendar.getTime()));
        System.out.println("10." + Month.of(calendar.get(Calendar.MONTH)) + format10.format(calendar.getTime()));
    }
}
