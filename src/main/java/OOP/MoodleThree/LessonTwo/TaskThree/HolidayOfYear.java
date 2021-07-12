package OOP.MoodleThree.LessonTwo.TaskThree;

import java.util.Calendar;

public class HolidayOfYear {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year=2045;
        calendar.add(Calendar.YEAR,year-calendar.getTime().getYear());
        int workDays = calendar.getWeeksInWeekYear()*5;
        int weekEnds = calendar.getWeeksInWeekYear()*2;
        System.out.println(workDays);
        System.out.println(weekEnds);
    }
}
