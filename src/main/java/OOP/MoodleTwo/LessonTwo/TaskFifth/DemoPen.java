package OOP.MoodleTwo.LessonTwo.TaskFifth;

/*
write methodini  ruchka kotta harfni yozganda kichik harfga qaraganda 2 marta
        ko'p siyoh sarflaydigan,probel (bo'sh joy) ni yozganda siyoh sarflanmaydigan va
                siyoh tugagan payt yozishdan to'xtaydigan qilib o'zgartirish
*/

import java.util.Scanner;

public class DemoPen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ruchkadagi siyoh miqdorini kriting: ");
        double ink = scanner.nextInt();
        System.out.print("har bir harf uchun siyoh sarfini kriting: ");
        double inkConsumption = scanner.nextDouble();
        Pen pen = new Pen(ink, true, inkConsumption);
        while (true) {
            System.out.println("1. Yozish");
            System.out.println("2. Ruchka tugmasini bosish");
            System.out.println("3. Siyoh qo'yish");
            System.out.println("0. Chiqish");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Yozish uchun so'zni kiriting: ");
                    scanner = new Scanner(System.in);
                    String word = scanner.nextLine();
                    word = word.trim().replaceAll(" ", "");
                    pen.write(word);
                    break;
                case 2:
                    pen.clickButton();
                    break;
                case 3:
                    System.out.println("qancha siyoh quymoqchisiz: ");
                    ink = scanner.nextDouble();
                    pen.setInk(ink);
                    break;
                case 0:
                    return;
            }
        }
    }
}

