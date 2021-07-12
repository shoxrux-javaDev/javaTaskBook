package PDP.groupPractice.ExtraTask.EkubEkuk;

import java.util.Scanner;

public class EkubEkukDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("EKUK(" + number1 + ", " + number2 + ") = " + getEkuk(number1, number2));
        System.out.println("EKUB(" + number1 + ", " + number2 + ") = " + getEkub(number1, number2));
    }

    private static int getEkub(int number1, int number2) {
        // Eng katta umumiy bo'luvchi
        // 8 16 , 12 36,
        //  8       12

        int minimal = Math.min(number1, number2);

        for (int i = minimal; i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0)
                return i;
        }
        return 0;
    }

    public static int getEkuk(int num1, int num2) {
        // Eng kichik umumiy karrali
        //    4 12  6 18
        //     12    18

        // 25 35
        int maximal = Math.max(num1, num2);

        for (int i = maximal; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0)
                return i;
        }

        return 0;
    }
}
