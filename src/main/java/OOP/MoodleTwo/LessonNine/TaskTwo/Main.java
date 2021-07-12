package OOP.MoodleTwo.LessonNine.TaskTwo;

public class Main {
    public static void main(String[] args) {
        int a=20,b=30;
        Number_comparison max_num=(num1,num2)-> {
            System.out.println("katta son " + Math.max(num1, num2));
            System.out.println("kichik son "+Math.min(num1,num2));
        };
        max_num.num(a, b);
    }
}
