package OOP.MoodleThree.LessonFive.TaskSeven;

import java.io.*;

public class AddTwoFile {
    public static void main(String[] args) {

        try (InputStream fileOne = new FileInputStream(new File("src/file/FirstFile.txt"));
             InputStream fileTwo = new FileInputStream(new File("src/file/SecondFile.txt"));
             OutputStream fileThree = new FileOutputStream("src/file/thirdFile.txt")) {

            byte[] byte1 = new byte[(fileOne.available())];
            byte[] byte2 = new byte[(fileTwo.available())];
            int length = fileOne.read(byte1);
            int length1 = fileTwo.read(byte2);
            if (length > 0&&length1>0) {
                fileThree.write(byte1, 0, length);
                fileThree.write(byte2, 0, length1);
            }
            System.out.println("the files copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
