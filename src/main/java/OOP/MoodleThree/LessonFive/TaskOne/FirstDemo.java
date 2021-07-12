package OOP.MoodleThree.LessonFive.TaskOne;

import java.io.File;
import java.io.IOException;

public class FirstDemo {
    public static void main(String[] args) throws IOException {

        File file = new File("D:/File");
        if (!file.isFile()) {
            System.out.println("Bu file");
        } else if (file.isDirectory()) {
            System.out.println("Bu papka");
        }
    }
}
