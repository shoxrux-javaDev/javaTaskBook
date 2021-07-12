package OOP.MoodleThree.LessonFive.TaskNine;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.*;

public class CreateNewFolder {
    public static void main(String[] args) throws IOException {
        int length;
        Path path;
        NameMonth[] values = NameMonth.values();
        LocalDate localDate = LocalDate.now();
        int currentYear = localDate.getYear();
        File folderOfTheYear = new File("D:/" + currentYear);
        boolean year = folderOfTheYear.mkdir();
        PrintWriter output = null;
        if (year) {
            for (NameMonth value : values) {
                File folder = new File("D:/2021/" + value);
                boolean folderOfMonth = folder.mkdir();
                if (folderOfMonth) {
                    boolean b = false;
                    if (LocalDate.now().isLeapYear())
                        b = true;
                    length = Month.valueOf(value.getName()).length(b);
                    assert false;
                    for (int j = 1; j <= length; j++) {
                        String day = "";
                        String month = "";
                        if (j > 0 && j < 10)
                            day = "0" + j;
                        else
                            day = j + "";

                        int m = (value.ordinal() + 1);
                        if (m > 0 && m < 10)
                            month = "0" + m;
                        else
                            month = m + "";
                        String date = day + "." + month + ".2021.txt";
                        File file = new File(folder.getAbsolutePath() + "/" + date);
                        boolean fileOfDay = file.createNewFile();
                        output = new PrintWriter(file.getAbsolutePath());
                        if (fileOfDay) {
                            path = Paths.get(file.getAbsolutePath());
                            BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
                            output.println(basic.creationTime());
                        }
                        output.flush();
                    }
                }
            }
            assert false;
            output.close();
        }

    }
}
