package OOP.MoodleThree.LessonFive.TaskThree;

import java.io.File;
import java.util.*;

public class FindAnyWordFromHardDisc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File hardOfDisc_D = new File("D:/2020");
        System.out.print("matn: ");
        String word= scanner.nextLine();
        if(hardOfDisc_D.exists() && hardOfDisc_D.isDirectory()) {
            File[] arr = hardOfDisc_D.listFiles();
            System.out.println("**********************************************");
            System.out.println("Files from Hard Disc D : " + hardOfDisc_D);
            System.out.println("**********************************************");
            assert arr != null;
            RecursivePrint(arr,0,word);
        }
    }
    static void RecursivePrint(File[] arr,int index,String word) {
        if(index == arr.length)
            return;

        if(arr[index].isFile()) {
            if(arr[index].getName().contains(word)) {
                System.out.println("siz kiritgan matn ("+arr[index].getName()+") faylda mavjud");
            }
        } else if(arr[index].isDirectory()) {
            if (arr[index].getName().contains(word)) {
                System.out.println("siz kiritgan matn ["+arr[index].getName()+"] papkasida mavjud");
            }
            RecursivePrint(((arr[index].listFiles())), 0,word);
        }
        RecursivePrint(arr,++index,word);
    }
}
