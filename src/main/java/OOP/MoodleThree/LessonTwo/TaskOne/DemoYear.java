package OOP.MoodleThree.LessonTwo.TaskOne;

import java.util.*;

public class DemoYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("ixtiyoriy yilni kiriting: ");
        int year=scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        System.out.println(calendar.getWeekYear());
        if((calendar.getWeekYear()/100)%4==0&&calendar.getWeekYear()%4==0){
            System.out.println(calendar.getWeekYear()+"=kabisa yili");
        }else{
            System.out.println(calendar.getWeekYear()+"=kabisa yili emas");
        }*/

        System.out.print("ixtiyoriy yilni kiriting: ");

        int year=scanner.nextInt();
        GregorianCalendar calendar = new GregorianCalendar();
        if(calendar.isLeapYear(year)){
            System.out.println("Kabisa yili");
        } else {
            System.out.println("Kabisa yili emas");
        }




    }
}
