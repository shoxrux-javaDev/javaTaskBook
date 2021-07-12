package OOP.MoodleThree.LessonOne.TaskFour;

import java.time.Month;
import java.util.Scanner;

public class DemoMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("choose a month: ");
      /*NameMonth seasons=NameMonth.APRIL;*/
       /* for (NameMonth name : seasons) {

        }*/
/*        System.out.println("1." + Month.JANUARY);
        System.out.println("2." + Month.FEBRUARY);
        System.out.println("3." + Month.MARCH);
        System.out.println("4." + Month.APRIL);
        System.out.println("5." + Month.MAY);
        System.out.println("6." + Month.JUNE);
        System.out.println("7." + Month.JULY);
        System.out.println("8." + Month.AUGUST);
        System.out.println("9." + Month.SEPTEMBER);
        System.out.println("10." + Month.OCTOBER);
        System.out.println("11." + Month.NOVEMBER);
        System.out.println("12." + Month.DECEMBER);*/
            System.out.print("Oy nomini kiriting: ");
        String takeName = scanner.nextLine().toUpperCase();
            showMonth(takeName);

        }

    private static void showMonth(String takeName) {
        switch (takeName) {
            case "JANUARY":
                System.out.println(Month.JANUARY+NameMonth.JANUARY.getName()+" fasliga to'gri keladi");
                break;
            case "FEBRUARY":
                System.out.println(Month.FEBRUARY+NameMonth.FEBRUARY.getName()+" fasliga to'gri keladi");
                break;
            case "MARCH":
                System.out.println(Month.MARCH+NameMonth.MARCH.getName()+" fasliga to'gri keladi");
                break;
            case "APRIL":
                System.out.println(Month.APRIL+NameMonth.APRIL.getName()+" fasliga to'gri keladi");
                break;
            case "MAY":
                System.out.println(Month.MAY+NameMonth.MAY.getName()+" fasliga to'gri keladi");
                break;
            case "JUNE":
                System.out.println(Month.JUNE+NameMonth.JUNE.getName()+" fasliga to'gri keladi");
                break;
            case "JULY":
                System.out.println(Month.JULY+NameMonth.JULY.getName()+" fasliga to'gri keladi");
                break;
            case "AUGUST":
                System.out.println(Month.AUGUST+NameMonth.AUGUST.getName()+" fasliga to'gri keladi");
                break;
            case "SEPTEMBER":
                System.out.println(Month.SEPTEMBER+NameMonth.SEPTEMBER.getName()+" fasliga to'gri keladi");
                break;
            case "OCTOBER":
                System.out.println(Month.OCTOBER+" "+NameMonth.OCTOBER.getName()+" fasliga to'gri keladi");
                break;
            case "NOVEMBER":
                System.out.println(Month.NOVEMBER+NameMonth.NOVEMBER.getName()+" fasliga to'gri keladi");
                break;
            case "DECEMBER":
                System.out.println(Month.DECEMBER+NameMonth.DECEMBER.getName()+" fasliga to'gri keladi");
                break;
        }
    }
    }


