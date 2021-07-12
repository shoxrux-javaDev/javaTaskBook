package OOP.MoodleTwo.LessonFive.TaskThird;

public class Main {

    public static void main(String[] args) {

        BankAccount check= new CheckingAccount("shoxrux",200);
        BankAccount save= new SavingAccount("shoxrux",300);

        check.deposit(300);
        check.withdraw(200);


    }


}
