package OOP.MoodleTwo.LessonOne.TaskFifth;


    /* Quyidagi atributlari bor bo’lgan Student nomli klass yarating:
       familiya,  ismi,  guruh nomeri, o’qiydigan fanlari (5 ta fandan iborat massiv).
       O’qidigan fanlari ro’yxatini ekranga chiqazuvchi printSubjects nomli method yarating*/

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        while (true) {
            Scanner student = new Scanner(System.in);
            System.out.print("Familyangizni kriting: ");
            String surname = student.nextLine();

            System.out.print("Ismingizni kriting: ");
            String name = student.nextLine();

            System.out.print("Gruh raqamingizni kriting: ");
            String groupNumber = student.nextLine();

            String[] subject = new String[5];
            for (int i = 0; i < subject.length; i++) {
                System.out.print("O'qiydigan " + (i + 1) + ") faningizni kriting: ");
                subject[i] = student.nextLine();
            }
            ReturnAmount objectStudent = new ReturnAmount(surname, name, groupNumber, subject);
            System.out.print("\n Agar bizdagi ma'lumotlar to'gri bo'lsa \"+\" belgisini aksi bo'lsa \"-\" kriting:\n\n");
            System.out.println("Familiyanigiz: " + objectStudent.showNumber()[0]);
            System.out.println("Ismingiz: " + objectStudent.showNumber()[1]);
            System.out.println("Gruh raqamingiz: " + objectStudent.showNumber()[2]);
            for (int i = 0; i < subject.length; i++) {
                System.out.println("sizningiz " + (i + 1) + " chi faningiz: " + objectStudent.printSubjects()[i]);
            }
            System.out.print("\n belgi => ");
            String getsymbol = student.nextLine();
            if (getsymbol.equals("+")) {
                System.out.println("Bizga ishonch bildirganingiz uchun raxmat!");
                return;
            } else {
                System.out.println("ma'lumotingizni qayta joylashga urinib ko'ring");
            }
        }
    }
}

