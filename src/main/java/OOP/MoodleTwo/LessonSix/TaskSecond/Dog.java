package OOP.MoodleTwo.LessonSix.TaskSecond;

public class Dog implements Animal {
    private String nickName;
    private String genus;
    private String owner;

    public Dog(String nickName, String genus, String owner) {
        this.nickName = nickName;
        this.genus = genus;
        this.owner = owner;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void run() {
        System.out.println("usually "+getNickName()+" runs very fast");
    }

    public void guard(){
        System.out.println(nickName+" is a good guarder");
    }

    @Override
    public void sound() {
        System.out.println(nickName+" can make a sound");
    }

    @Override
    public void eat() {
        System.out.println(nickName+" only eats dog foods which given by "+getOwner());
    }
}
