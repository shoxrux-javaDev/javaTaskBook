package OOP.MoodleThree.LessonFive;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise {
    public static void main(String[] args) throws IOException {

        char[] chars = new char[]{'a','b','c','d'};
        File file = new File("file.txt");

        FileWriter fileWriter =new FileWriter("SecondFile.txt");
        fileWriter.write(chars);
        fileWriter.write(chars,1,3);
        fileWriter.flush();
        fileWriter.close();
    }
}

