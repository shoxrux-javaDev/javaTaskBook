package OOP.MoodleTwo.LessonFive.TaskFourth;

public class Person extends Employee{
    protected String name;
    protected String address;
    protected String hairColor;
    protected String eyeColor;

    public Person(String name, String address, String hairColor, String eyeColor) {
        this.name = name;
        this.address = address;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public void setName(String name){
        this.name = name;
    }

    public void newAddress(){
        this.address=address;
    }

    @Override
    public void hire() {

    }

    @Override
    public void fire() {

    }
}
