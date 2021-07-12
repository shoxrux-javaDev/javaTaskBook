package OOP.MoodleThree.LessonTwo.TaskFive;

import java.util.Calendar;

public enum Holiday {
    NEW_YEAR(Calendar.FRIDAY, Calendar.JANUARY),
    DAY_OF_SOLIDER(Calendar.THURSDAY, Calendar.JANUARY),
    DAY_OF_WOMEN(Calendar.MONDAY, Calendar.MARCH);
    private int day;
    private int month;

    Holiday(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Holiday{" +
               "day=" + day +
               '}';
    }
}
