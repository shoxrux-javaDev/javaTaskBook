package OOP.MoodleTwo.LessonNine.TaskSix;

public class DemoPositive {
    public static void main(String[] args) {
        double[] indexNumber = {1, -2, 4, -87, 23, -76, -23, 78, 12, 23 - 34};
        Postive_Number check = (numbers) -> {
            int sum = 0;
            for (double item : indexNumber) {
                if (item > 0) {
                    sum += item;
                }
            }
            return sum;
        };
        System.out.println("musbat sonlar yig'indisi="+check.number(indexNumber));
    }
}
