package OOP.MoodleThree.LessonFive.TaskSix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExample {
    public static void main(String[] args) {
        copyAnotherFile();
    }
        public static void copyAnotherFile () {
        try {
            FileInputStream inStream = new FileInputStream("SecondFile.txt");
            FileOutputStream outStream = new FileOutputStream("D:/File/IkkinchiFayl.txt");
            byte[] buffer = new byte[inStream.available()];

            int length;

            while ((length = inStream.read(buffer))!=-1){
                outStream.write(buffer,0,length);
            }

            inStream.close();
            outStream.close();

            System.out.println("File copied successfully!!");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

