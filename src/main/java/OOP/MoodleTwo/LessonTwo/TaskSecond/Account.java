package OOP.MoodleTwo.LessonTwo.TaskSecond;

public class Account {
    private String name;
    private String surname;
    private double balance;

    public Account(String name, String surname, double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }
    public void getName(){
        System.out.println("sizning ismingiz:"+this.name);
    }
    public void getSurname(){
        System.out.println("sizning familiyangiz:"+this.surname);
    }
    public void getBalance(){
        System.out.println("sizning balansingiz:"+this.balance);
    }
}
