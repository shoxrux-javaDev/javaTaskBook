package OOP.MoodleThree.LessonFive.TaskThree;

import java.io.*;
import java.util.*;

public class FileWithRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder nameOfFileAndFolder = new StringBuilder();
        System.out.println("matni kiriting: ");
        String word = scanner.nextLine();
        File file = new File("D:/");
        String path = file.getAbsolutePath();
        File[] file1 = file.listFiles();

            for (int i = 0; i < file1.length; i++) {
                if (file1[i].isFile()) {
                    if (file1[i].getName().contains(word)) {
                        System.out.println("siz qidirgan matn shu file ichida mavjud " + file1[i].getName());
                        new File(file1[i].getAbsolutePath());
                    }
                } else if (file1[i].isDirectory()) {
                    if (file1[i].getName().contains(word)) {
                        System.out.println("siz qidirgan matn shu papka ichida mavjud: " + file1[i].getName());
                        new File(file1[i].getAbsolutePath() + file1[i].getPath());
                    }
                }
            }
        findNameOfString(file1, word, path);


    }

    static void findNameOfString(File[] file1, String word, String path) {


    }
}
