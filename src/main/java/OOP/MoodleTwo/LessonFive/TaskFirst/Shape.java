package OOP.MoodleTwo.LessonFive.TaskFirst;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract String getColor();
}
