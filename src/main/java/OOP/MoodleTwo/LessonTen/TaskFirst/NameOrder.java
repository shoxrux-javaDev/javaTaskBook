package OOP.MoodleTwo.LessonTen.TaskFirst;

class NameOrder{

    private String name;

    public NameOrder(String name) {
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
        return "NameOrder{" +
               "name='" + name + '\'' +
               "}\n";
    }
}
