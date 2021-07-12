package OOP.MoodleThree.LessonFive.TaskNine;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;


public class CreateFileGetTime {
    public static void main(String[] args) throws IOException {
        LocalDateTime localDateTime;
        Path path= Paths.get("D:/2020/April/bb.txt");
        File file = new File("D:/2020/April");
        File[] files=file.listFiles();
        assert files != null;
        for (File file1 : files) {
            if (file1.isFile()) {
                File absoluteFile = file1.getAbsoluteFile();
                PrintWriter output = new PrintWriter(absoluteFile);
                BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
                FileTime fileTime = basic.creationTime();
                localDateTime = LocalDateTime.now();
                output.println(localDateTime);
                output.close();
            }
        }




    }
}
