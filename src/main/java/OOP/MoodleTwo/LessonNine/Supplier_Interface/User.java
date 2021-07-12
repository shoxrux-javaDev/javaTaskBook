package OOP.MoodleTwo.LessonNine.Supplier_Interface;

public class User {
    private String name;

    String getName() {
        return name;
    }

    User(String n) {
        this.name = n;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
