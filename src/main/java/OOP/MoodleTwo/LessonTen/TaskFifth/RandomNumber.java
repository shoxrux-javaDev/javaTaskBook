package OOP.MoodleTwo.LessonTen.TaskFifth;

public class RandomNumber {
    private int number;

    public RandomNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return ""+number;
    }
}
