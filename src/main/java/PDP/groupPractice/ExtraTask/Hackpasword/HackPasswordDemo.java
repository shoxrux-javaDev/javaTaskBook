package PDP.groupPractice.ExtraTask.Hackpasword;

import java.util.Random;

public class HackPasswordDemo {
    public static void main(String[] args) {

        // 1. Yangi 4xonali ham raqam ham harf qatnashgan parol generatsiya qilish
        // 2. O'sha parolni topish

        String password = getRandomPassword();
        System.out.println(password);

        // 0 0 0 0
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // 60 ta

        // ;

        int count = 0;
        for (int i = 0; i < 36; i++) {
            for (int j = 0; j < 36; j++) {
                for (int k = 0; k < 36; k++) {
                    for (int l = 0; l < 36; l++) {
                        String result = str.charAt(i) + "" + str.charAt(j) + "" + str.charAt(k) + "" + str.charAt(l);
                        count++;
                        if (result.equals(password)) {
                            System.out.println("Biz qidirgan parol: " + result + " buni " + count + " ta urinishda topdik!");
                            return;
                        }
                    }
                }
            }
        }

    }

    public static String getRandomPassword() {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // 36 ta

        String result = "";
        Random random = new Random();

        while (true) {
            for (int i = 0; i < 4; i++) {
                result += str.charAt(random.nextInt(36));
            }

            // 4864
            if (isNumberLetter(result)) {
                return result;
            } else {
                result = "";
            }
        }

    }

    private static boolean isNumberLetter(String result) {

        // DDD4;
        int countNumber = 0;
        int countLetter = 0;

        for (int i = 0; i < 4; i++) {
            char c = result.charAt(i);

            if (Character.isDigit(c)) {
                countNumber++;
            }
            if (Character.isLetter(c)) {
                countLetter++;
            }
        }

        return countNumber > 0 && countLetter > 0;
    }


}

