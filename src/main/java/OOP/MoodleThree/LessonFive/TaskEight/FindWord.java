package OOP.MoodleThree.LessonFive.TaskEight;

import java.io.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;


public class FindWord {
    public static void main(String[] args) {
        int count = 1;
        Map<String, String> map = new HashMap<>();
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("D:/File/oxford.txt"));
            String line;
            while ((line = buffer.readLine()) != null) {
                if (line.length() > 2) {
                    String key = line.substring(0, line.indexOf(" "));
                    String value = line.substring(line.indexOf(" ") + 1);
                    map.put(key, value);
                }
            }
//            boolean key = map.containsKey(word);
            /*Set<Map.Entry<String, Integer>> entries = map.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                if(entry.getKey().contains(word)){
                    System.out.println("Hi");
                }
            }*/
//            if (key) {
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
//        String word = "Abandoned";
        String word= scanner.nextLine();
        System.out.println("searching...");
        waiting(5);
        System.out.println("-----------");
        System.out.println(word+"-> "+map.get(word));
    }
    public static void waiting(int time) {
        LocalTime start = LocalTime.now();
        long count_second=0;
        while (count_second <= time) {
            count_second= Duration.between(start,LocalTime.now()).getSeconds();
        }
    }
}
