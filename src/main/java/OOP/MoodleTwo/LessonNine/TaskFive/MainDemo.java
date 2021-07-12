package OOP.MoodleTwo.LessonNine.TaskFive;

public class MainDemo {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,7,8,9};
        Lamda_Add lambda=(add)->{
          int sum=0;
          for(int item:number){
             sum+=item;
          }
          return sum;
        };
        System.out.println("massivdagi sonlar yig'indisi "+lambda.check(number));
    }
}
