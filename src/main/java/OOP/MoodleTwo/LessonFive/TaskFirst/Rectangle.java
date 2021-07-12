package OOP.MoodleTwo.LessonFive.TaskFirst;

public class Rectangle extends Shape{

   private double length;
   private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public void showInfo() {
        System.out.println("Rectangle ga ko'rinadi");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
