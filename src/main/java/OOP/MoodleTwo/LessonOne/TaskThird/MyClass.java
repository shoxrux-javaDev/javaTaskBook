package OOP.MoodleTwo.LessonOne.TaskThird;

import java.util.Scanner;

/*     Ikkita atribut: firstAtribut va secondAttribut larga ega MyClass nomli klass yarating.
        Ushbu atributlar qiymatini aboutAttributes, yig’indisini sumAttributes,
        kattasini maxAttribute ekranga chiqazadigan methodlarini yarating.*/

public class MyClass {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("ixtiyoriy son kriting:");
        double firstAtribut = number.nextDouble();
        System.out.print("yana bir ixtiyoriy son kriting:");
        double secondAttribut = number.nextDouble();
        SolutionAtribut values = new SolutionAtribut(firstAtribut, secondAttribut);
        System.out.println("Atributlar qiymatlari: " + values.aboutAttributes()[0] + " va " + values.aboutAttributes()[1] + "\n " +
                "Atributlar yig'indisi: " + values.sumAttributes() + "\n " +
                "Atributlar maksimali: " + values.maxAttribute());
    }
}
