package OOP.MoodleThree.LessonFive.TaskNine;

public enum NameMonth{
    January("JANUARY"),February("FEBRUARY"),March("MARCH"),
    April("APRIL"),May("MAY"),July("JULY"),
    June("JUNE"),August("AUGUST"),September("SEPTEMBER"),
    October("OCTOBER"),November("NOVEMBER"),December("DECEMBER");

    private String name;

    NameMonth(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
