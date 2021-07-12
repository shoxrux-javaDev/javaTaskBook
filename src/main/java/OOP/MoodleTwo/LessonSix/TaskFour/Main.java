package OOP.MoodleTwo.LessonSix.TaskFour;

public class Main {
    public static void main(String[] args) {
        //functional interface with class
        InterfaceOne interfaceOne = new Solution();
        System.out.println(interfaceOne.sum(15, 3));

        //functional interface with anonim class
        InterfaceOne interfaceTwo = new InterfaceOne() {
            @Override
            public int sum(int a, int b) {
                return a * b * 10;
            }
        };
        int result1 = interfaceTwo.sum(4, 5);
        System.out.println(result1);
        //functional interfaceThree with lambda expression
        InterfaceOne interfaceThree = (a, b) -> a % b;
        int result2 = interfaceThree.sum(9, 5);
        System.out.println(result2);
        //Second lambda expression
        InterfaceOne interfaceFour = (b, c) -> b*c;
        double result3= interfaceFour.sum(7,8);
        System.out.println(result3);
        //third lambda expression
        InterfaceOne interfaceFive=(g,d)-> g/d;
        System.out.println(interfaceFive.sum(80,5));


    }
}
