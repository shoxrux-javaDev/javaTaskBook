package OOP.MoodleThree.LessonOne.TaskFour;

public enum NameMonth {
    APRIL("Spring"), AUGUST("Summer"),
    DECEMBER("Winter"), FEBRUARY("Winter"), JANUARY("Winter"),
    JULY("Summer"), JUNE("Summer"), MARCH("Spring"),
    MAY("Spring"), NOVEMBER("Autumn"), OCTOBER("Autumn"),
    SEPTEMBER("Autumn");
    private String name;

    NameMonth(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "NameMonth{" +
               "name='" + name + '\'' +
               '}';
    }
}
