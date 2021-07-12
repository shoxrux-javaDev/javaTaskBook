package OOP.MoodleTwo.LessonNine.Unary_interface;

import java.util.function.UnaryOperator;

public class Unary {

    public static void main(String[] args) {

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // 25
        System.out.println(square.apply(25));

    }
}

