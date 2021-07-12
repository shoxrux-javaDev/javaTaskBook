package OOP.MoodleTwo.LessonElleven.TaskSecond;

public class SecondTask implements Comparable<SecondTask> {
    private int number;

    public SecondTask(int number) {
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
        return "SecondTask{" +
               "number=" + number +
               '}';
    }

    @Override
    public int compareTo(SecondTask other) {
        return this.number=(other.number);
    }
}
