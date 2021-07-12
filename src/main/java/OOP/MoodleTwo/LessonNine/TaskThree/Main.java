package OOP.MoodleTwo.LessonNine.TaskThree;

public class Main {
  // public static int[] arr = {1, 2, 3, 4, 5, 6, 7, 888, 54, 22, 67, 99};
    public static void main(String[] args) {

        Max_integer index = OtherClass::MaxInteger;

        //Max_integer index = (numbers) -> OtherClass.MaxInteger(numbers) ;

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 888, 54, 22, 67, 99};

        System.out.println("massivdagi eng katta son "+index.max(arr));

        // salom
        // salom
        // salom
    }


}