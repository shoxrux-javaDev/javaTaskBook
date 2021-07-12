package OOP.MoodleTwo.LessonSix.TaskSecond;

public class Tiger implements Animal {
    private String name;
    private String type;
    private String belong;

    public Tiger(String name, String type, String belong) {
        this.name = name;
        this.type = type;
        this.belong = belong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public void run() {
        System.out.println("usually "+getType()+" runs when it hungry ");
    }

    public void attack(){
        System.out.println(getName()+" dangerous tiger because when it hungry can attack");
    }

    @Override
    public void sound() {
        System.out.println(getName()+" make a high sound ");
    }

    @Override
    public void eat() {
        System.out.println(getType()+" eats only meats");
    }
}
