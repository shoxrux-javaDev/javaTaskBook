package OOP.MoodleThree.LessonTwo.TaskFour;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FridayDemo {
    public static void main(String[] args) {
        int countOfFriday = 1;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        int countOfWeek = 1;
        while (countOfFriday <= 10) {
            calendar.set(Calendar.WEEK_OF_YEAR, countOfWeek++);
            int i = calendar.get(Calendar.DAY_OF_WEEK) - 2;
            if (i == 5) {
                System.out.println("yilning " + countOfFriday + " jumasi: " + dateFormat.format(calendar.getTime()) +
                                   " sanaga to'gri keladi");
                countOfFriday++;
            }
        }


    }
}
