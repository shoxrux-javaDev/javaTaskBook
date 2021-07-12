package OOP.MoodleTwo.LessonNine.TaskEight;

import java.util.function.Predicate;

public class Need_show {
    public static void main(String[] args) {
        int[] numberPrime = {2, 3, 4, 5, 6, 7, 8, 12, 13, 15, 19};

        Predicate<Integer> check = number -> {
            for (int i = 2; i < number; i++)
                if (number % i == 0) return false;

            return true;
        };
        System.out.println("tub sonlar yig'indii " + sumPrime(numberPrime, check));
    }

    public static int sumPrime(int[] numberPrime, Predicate<Integer> check) {
        int sum = 0;
        for (int item : numberPrime) {
            if (check.test(item)) {
                sum += item;
            }
        }
        return sum;
    }


   /* public void shouldForceCurlyBracesOnForLoops() {
        for (int i = 0; i < 3; i++)
            System.out.println("I have no idea where the indentation is supposed to be");
    }*/

}
