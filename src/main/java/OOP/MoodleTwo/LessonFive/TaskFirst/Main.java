package OOP.MoodleTwo.LessonFive.TaskFirst;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("red",32.5,40.5);
        Shape circle = new Circle("blue",36);
 
        rectangle.area();
        circle.area();

        System.out.println(rectangle.toString());
        System.out.println(circle.toString());
    }
}
