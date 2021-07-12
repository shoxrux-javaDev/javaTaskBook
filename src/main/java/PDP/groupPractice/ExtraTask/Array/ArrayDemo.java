package PDP.groupPractice.ExtraTask.Array;

import java.util.Scanner;

public class ArrayDemo {

        public static void main(String[] args) {

            // Arrays

        /*String[] names = {"Shokir", "Ahmad", "Ali", "Tohir", "Karim"};
        double[] sign = {5, 0, 4, 3, 5};
*/

        /*for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " bahosi: " + sign[i]);
        }
        System.out.println("\n");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i] + " bahosi: " + sign[i]);
        }*/

            //System.out.println(names[5]);

            // String array
        /*String[] names2 = new String[40];
        int index = 0;
        for (char c = 'A'; c <= 'Z'; c++) {
            names2[index++] = String.valueOf(c);
        }
        for (String s : names2) {
            System.out.print(s + " ");
        }

        // int array
        System.out.println("\n");
        int[] numbers = new int[40];
        int index1 = 0;
        for (int i = 1; i <= 29; i++) {
            numbers[index1++] = i;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }*/

            // 1 2 5 4 8 7 4 5 8 754 654 654

        /*int[][] matrix = new int[5][5];

        int number = 5;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                matrix[i][j] = number;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/


        /*String[][] matrix = new String[5][5];

        String name = "Mehriddin";
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                matrix[i][j] = name;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/

        /*int[] numbers = {5, 10, 15, 20, 25, 30}; // bir o'lchovli

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(hasArray(number, numbers)) {
            System.out.println("Topildi!");
        } else {
            System.out.println("Topilmadi!");
        }*/

            Scanner scanner = new Scanner(System.in);

            int[][] numbers = new int[3][3];

            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    numbers[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("2 - qator 3-ustunidagi raqam: " + numbers[0][3]);



        }

        public static boolean hasArray(int number, int[] arr) {
            for (int num : arr) {
                if (num == number)
                    return true;
            }
            return false;
        }

    }

