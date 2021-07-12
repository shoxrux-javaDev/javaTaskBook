package PDP.groupPractice.ExtraTask.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        sortArray(numbers);

        //Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void sortArray(int[] numbers) {

        // 5 7 13 3 1 15
        // 1 3 5 7 13 15

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}

