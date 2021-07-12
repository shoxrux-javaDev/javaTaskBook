package OOP.MoodleTwo.LessonOne.TaskFourth;

public class ViewDataAtribut {
    private final String day;
    private final String month;
    private final String year;

    public ViewDataAtribut(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String[] showDate() {
        String[] valueConcat = new String[3];
        valueConcat[0] = day;
        valueConcat[1] = month;
        valueConcat[2] = year;
        return valueConcat;
    }

}

