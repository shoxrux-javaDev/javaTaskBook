package OOP.MoodleThree.LessonFive.TaskFour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindRow {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("src/file/SecondFile.txt"));
            int count=0;
            while ((buffer.readLine())!=null) {
                count++;
            }
            System.out.println("fayl "+count+" ta qator mavjud");
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
