package OOP.MoodleTwo.LessonTen.TaskSecond;

public class Name {
    private String name;

    public Name() {
    }

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name= "+name+" | ";
    }
}
