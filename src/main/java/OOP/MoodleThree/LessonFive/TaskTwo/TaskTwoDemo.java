package OOP.MoodleThree.LessonFive.TaskTwo;

import java.io.File;
import java.io.IOException;

public class TaskTwoDemo {
    public static void main(String[] args) {

        File file = new File("D:/File");
        File[] file1 = file.listFiles();
        if (file1 != null) {
            ChekFolder(file1);
        }
    }

    public static void ChekFolder(File[] file1) {
        boolean bool1 = false, bool2 = false;
        for (File subFile : file1) {
            if (subFile.isFile()) {
                bool1 = true;
            } else if (subFile.isDirectory()) {
                bool2 = true;
            }
        }
        if (bool1 && bool2) {
            System.out.println("There are folders and files");
        } else if (bool2) {
            System.out.println("There are folders");
        } else if (bool1) {
            System.out.println("There are files");
        } else {
            System.out.println("folders is empty");
        }
    }

}
