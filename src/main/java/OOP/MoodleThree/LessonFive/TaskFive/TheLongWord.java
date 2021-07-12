package OOP.MoodleThree.LessonFive.TaskFive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TheLongWord {
    public static void main(String[] args) {
        findTheLongWord();
    }

    public static void findTheLongWord() {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("SecondFile.txt"));
            String word,name = null;
            int longs = 0;
            while ((word = buffer.readLine()) != null) {
                String[] s = word.split(" ");
                for (String value : s) {
                    if (value.length() > longs) {
                        longs = value.length();
                        name=value;
                    }
                }
            }
            System.out.println("fayldagi eng uzun so'z "+name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
