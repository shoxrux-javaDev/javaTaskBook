package PDP.groupPractice.ExtraTask.Array;

import java.util.Scanner;

public class ArrayTask {

        public static void main(String[] args) {
            int[] numbers = new int[5];

            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            boolean notFound = true;
            for (int number : numbers) {
                if (number % 2 == 1) {
                    notFound = false;
                    break;
                }
                sum += number;
            }

            if (notFound)
                sum -= (numbers[0] + numbers[numbers.length - 1]);

            System.out.println(sum);
        }
    }

