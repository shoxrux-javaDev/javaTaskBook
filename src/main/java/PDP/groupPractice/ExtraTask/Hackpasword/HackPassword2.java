package PDP.groupPractice.ExtraTask.Hackpasword;

import java.util.Random;

public class HackPassword2 {
    public static void main(String[] args) {

        // 1. 4xonali faqat raqamlardan tashkil topgan parol generatsiya qilamiz
        // 2. Binary search yordamida topamiz

        int password = getRandomPassword();
        System.out.println(password);
        int count = 0;

        int first = 1000;
        int last = 9999;
        int middle = (first + last) / 2;
        while (first <= last) {
            count++;
            if (middle < password) {
                first = middle + 1;
            } else if (middle == password) {
                System.out.println("Biz qidirgan parol: " + middle + " uni " + count + " ta urinishda topdik");
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }

    }

    public static int getRandomPassword() {

        Random random = new Random();
        // random.nextInt(max - min + 1) + min

        return random.nextInt(9000) + 1000;
    }

}

