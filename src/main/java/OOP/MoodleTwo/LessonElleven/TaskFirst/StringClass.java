package OOP.MoodleTwo.LessonElleven.TaskFirst;

public class StringClass {
    private String numbers;

    public StringClass(String numbers) {
        this.numbers = numbers;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "StringClass{" +
               "numbers='" + numbers + '\'' +
               '}';
    }
}
