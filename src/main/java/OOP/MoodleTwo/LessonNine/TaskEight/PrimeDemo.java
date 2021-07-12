/*
package OOP.MoodleTwo.LessonNine.TaskEight;

public class PrimeDemo {
    public static int sum = 0;

    public static void main(String[] args) {
        int[] numberPrime = {2, 3, 4, 5, 6, 7, 8, 12, 13, 15, 19};
        Prime_interface<Boolean, Integer> prime = (numbers) -> {
            for (int i = 2; i < numbers; i++) {
                if (numbers % i == 0) {
                    return false;
                }
            }
            return true;
        };
        Second_interface chekNumber = (num2) -> {
            for (int item : numberPrime) {
                if (prime.primeNumber(item)) {
                    sum += item;
                }
            }
            return sum;
        };

        System.out.println("tub sonlar yig'indii " + chekNumber.Test(numberPrime));
    }
}
*/
