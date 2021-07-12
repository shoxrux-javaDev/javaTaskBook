package OOP.MoodleThree.LessonTwo.TaskFive;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HolidayOfUzbekistan {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int countOfWorkDayInYear = 0, count = 1;
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 2);
        while (count <= 365) {
            calendar.set(Calendar.DAY_OF_YEAR, count++);
            if (isHoliday(calendar)) {
                countOfWorkDayInYear++;
            }
        }
        int i = calendar.getWeeksInWeekYear() * 7;
        System.out.println(dateFormat.format(calendar.getTime()) + " yilning ish kuni " + (i - countOfWorkDayInYear) + " ga teng");
    }

    public static boolean isHoliday(Calendar calendar) {
        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ||
            calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            return true;
        }
        if (calendar.get(Calendar.DAY_OF_WEEK) == Holiday.NEW_YEAR.getDay() &&
            calendar.get(Calendar.DAY_OF_MONTH) == Holiday.NEW_YEAR.getMonth()) {
            return true;
        }
        if (calendar.get(Calendar.DAY_OF_WEEK) == Holiday.DAY_OF_SOLIDER.getDay() &&
            calendar.get(Calendar.DAY_OF_MONTH) == Holiday.DAY_OF_SOLIDER.getMonth()) {
            return true;
        }
        if (calendar.get(Calendar.DAY_OF_WEEK) == Holiday.DAY_OF_WOMEN.getDay() &&
            calendar.get(Calendar.DAY_OF_MONTH) == Holiday.DAY_OF_WOMEN.getMonth()) {
            return true;
        }
        return false;
    }

}
