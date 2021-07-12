package OOP.MoodleThree.LessonOne.TaskThree;

public enum WindowUser {
ADMIN("Shoxrux"),
    USER("Abbos"),
    GUEST("Mehmon");
    private String name;

    WindowUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
