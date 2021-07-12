package OOP.MoodleTwo.LessonTen.TaskFifth;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        List<RandomNumber> random = new ArrayList<>(50);

        Random randomNum = new Random();
        System.out.print("[");
        for (int i = 0; i <50; i++) {
            random.add(new RandomNumber(randomNum.nextInt(100) - 1));
            System.out.print(random.get(i)+" ");
        }
        System.out.println("]");
    }
}

