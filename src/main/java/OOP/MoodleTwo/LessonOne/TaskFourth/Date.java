package OOP.MoodleTwo.LessonOne.TaskFourth;

       /*Quyidagi 3ta attribute bor bo’lgan Date klassini yarating: yil, oy va kun.
        15.05.2020 formatdagi sanani chop etuvchi mehod yarating.*/

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);
        System.out.println("ixtiyoriy bir kunning sonini kriting: ");
        String day = date.nextLine();

        System.out.println("ixtiyoriy bir oy sonini kriting: ");
        String month = date.nextLine();

        System.out.println("ixtiyoriy bir yil sonini kriting: ");
        String year = date.nextLine();

        ViewDataAtribut objectDate = new ViewDataAtribut(day, month, year);

        System.out.println("bizda sana: " + objectDate.showDate()[0] + "."
                + objectDate.showDate()[1] + "." + objectDate.showDate()[2]);
    }
}
