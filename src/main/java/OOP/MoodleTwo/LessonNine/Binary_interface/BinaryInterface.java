package OOP.MoodleTwo.LessonNine.Binary_interface;

import java.util.function.BinaryOperator;

public class BinaryInterface {
    public static void main(String[] args) {

        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(multiply.apply(10, -2)); // -20
    }
}

