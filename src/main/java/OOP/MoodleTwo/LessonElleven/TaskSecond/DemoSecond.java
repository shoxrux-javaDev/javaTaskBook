package OOP.MoodleTwo.LessonElleven.TaskSecond;

import java.util.*;

public class DemoSecond {
    public static void main(String[] args) {
        TreeSet<SecondTask> treeSet = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randNum = random.nextInt(201) + 300;
            SecondTask secondTask = new SecondTask(randNum);
            treeSet.add(secondTask);
            for (SecondTask second : treeSet) {
                System.out.println(second.getNumber());
            }
        }
    }
}
