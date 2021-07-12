package OOP.MoodleTwo.LessonSix.TaskSecond;

public class Cat implements Animal {
    private String  nickName;
    private String type;
    private String owner;

    public Cat(String nickName, String type, String owner) {
        this.nickName = nickName;
        this.type = type;
        this.owner = owner;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void run() {
        System.out.println(getNickName()+" don't like run");
    }

    @Override
    public void sound() {
        System.out.println(getNickName()+" can a make sound");
    }

    @Override
    public void eat() {
        System.out.println(getNickName()+" eats cats food");
    }
}
