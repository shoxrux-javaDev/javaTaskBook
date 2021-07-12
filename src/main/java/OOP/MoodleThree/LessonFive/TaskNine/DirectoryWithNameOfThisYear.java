package OOP.MoodleThree.LessonFive.TaskNine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DirectoryWithNameOfThisYear {
    public static void main(String[] args) throws IOException {
        Calendar calendar = new GregorianCalendar();
        LocalDateTime localDateTime =  LocalDateTime.now();
        calendar.set(localDateTime.getYear(),localDateTime.getMonthValue(),localDateTime.getDayOfMonth());
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int year = calendar.getWeekYear();
        File file = new File("D:\\aviation\\" + year );
        file.mkdir();
        for (int i = 0; i < 12; i++) {
            File month = new File("D:\\aviation\\" + year + "\\"+months[i]);
            month.mkdir();
            int length = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            for (int i1 = 0; i1 < length; i1++) {
                File day = new File("D:/" + year + "/"+months[i]+"/"+(i1+1)+"."+(i+1)+".txt");
                day.createNewFile();
                FileWriter fileWriter = new FileWriter(day);
                try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                    bufferedWriter.write(localDateTime.toString());
                }
            }
            calendar.add(Calendar.MONTH,1);
        }
    }
}
