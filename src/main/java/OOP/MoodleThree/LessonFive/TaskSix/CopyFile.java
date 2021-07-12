package OOP.MoodleThree.LessonFive.TaskSix;

import java.io.*;
import java.util.Arrays;

public class CopyFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("SecondFile.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:/File/UchinchiFayl.txt"));
            byte[] buffer=new byte[1024];
            int length;
            while ((length = reader.read()) != -1) {
                writer.write(length);
            }
            reader.close();
            writer.close();
            System.out.println("file copy successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
