package OOP.MoodleThree.LessonFive.TaskSeven;

// Java program to merge all files of a directory

import java.io.*;
import java.util.Objects;

class AddTwoFileAndWriteAnother {

    public static void main(String[] args) {

        File dir = new File("src/file");

        try (PrintWriter pw = new PrintWriter("src/file/thirdFile.txt")) {
            String[] fileNames = dir.list();
            if(fileNames!=null){
                for (String fileName : fileNames) {
                    File pathName = new File(dir, fileName);
                    BufferedReader br = new BufferedReader(new FileReader(pathName));
                    String line = br.readLine();
                    while (line != null) {
                        pw.println(line);
                        line=br.readLine();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(dir.getName()+" nomli faylidagi malumotlar mufaqiaytli ko'chirildi");
    }
}

