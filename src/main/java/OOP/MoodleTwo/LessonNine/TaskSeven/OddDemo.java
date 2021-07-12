package OOP.MoodleTwo.LessonNine.TaskSeven;

public class OddDemo {
    public static void main(String[] args) {
        Odd_interface submit =(numbers)->{
            int sum = 0;
            for(int item:numbers){
                if(item%2!=0){
                    sum+=item;
                }
            }
            return sum;
        };

        int[] oddNum={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println("massivdagi toq sonlar yig'indisi "+submit.oddNumber(oddNum));
    }
}
