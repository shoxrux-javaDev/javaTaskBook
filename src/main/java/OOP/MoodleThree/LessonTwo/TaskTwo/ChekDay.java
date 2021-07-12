package OOP.MoodleThree.LessonTwo.TaskTwo;

import javax.xml.bind.SchemaOutputResolver;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class ChekDay {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        int countOfWorkDay=0;
        System.out.println("joriy sana: "+format.format(calendar.getTime()));
        while (countOfWorkDay <= 20) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            int i = calendar.get(Calendar.DAY_OF_WEEK);

            if(i<=5)
                countOfWorkDay++;
        }
        System.out.println("20 ish kunidan keyingi sana "+format.format(calendar.getTime()));

    }
}
