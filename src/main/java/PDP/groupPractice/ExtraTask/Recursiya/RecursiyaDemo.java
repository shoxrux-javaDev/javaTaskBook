package PDP.groupPractice.ExtraTask.Recursiya;

import java.util.Scanner;

    public class RecursiyaDemo {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String number = scanner.nextLine();

            if (number.equals("0")) {
                System.out.println("no'l");
                return;
            }

            System.out.print(testBeforeMethod(number));
            System.out.println(getWordOfNumber(Long.parseLong(number)));
        }

        private static String testBeforeMethod(String number) {
            String result = "";
            for (int i = 0; i < number.length(); i++) {
                char c = number.charAt(i);
                if (c != '0') {
                    return result;
                } else {
                    result += "no'l";
                }
            }
            return result;
        }

        public static String getWordOfNumber(long number) {

            String result = "";

            String[] birlik = {"", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
            String[] unlik = {"", "o'n", "yigirma", "o'ttiz", "qirq", "ellik", "oltmish", "yetmish", "sakson", "to'qson"};

            // 125 125 125 125 125

            if ((number / 1000000000000L) > 0) {
                result += getWordOfNumber(number / 1000000000000L) + " trillion ";
                number = number % 1000000000000L; // number = 0;
            }

            if ((number / 1000000000) > 0) {
                result += getWordOfNumber(number / 1000000000) + " milliard ";
                number = number % 1000000000;
            }

            if ((number / 1000000) > 0) {
                result += getWordOfNumber(number / 1000000) + " million ";
                number = number % 1000000;
            }

            if ((number / 1000) > 0) {
                result += getWordOfNumber(number / 1000) + " ming ";
                number = number % 1000;
            }

            if ((number / 100) > 0) {
                result += getWordOfNumber(number / 100) + " yuz "; // bir yuz
                number = number % 100; // 25
            }
            // 25

            if (number > 0) {
                if (number < 10) {
                    result += birlik[(int) number];
                } else {
                    result += unlik[(int) number / 10] + " " + birlik[(int) number % 10];
                }
            }
            // bir yuz yigirma besh
            return result;

        }


        // Rekursive method
        // n! = 1 * 2 * 3 *.. *n;
        // 5! = 1 * 2 *3 * 4 * 5;
        public static int getNumber(int n) {
            if (n == 1) {
                return 1;
            }
            return n * getNumber(n - 1);
            // 10 * 393120
            // 9 * 43680
            // 8 * 5460
            // 7 * 780
            // 6 * 120
            // 5 * 24
            // 4 * 6
            // 3 * 2
            // 2 * 1
            //
        }
        // fibonacci
        // 1 1 2 3 5 8 13 21 34 55 89 ..


    }



