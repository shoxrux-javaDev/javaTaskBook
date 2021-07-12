package OOP.MoodleTwo.LessonNine.TaskThree;

public class OtherClass {
    public static int MaxInteger(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        return max;
    }
}
