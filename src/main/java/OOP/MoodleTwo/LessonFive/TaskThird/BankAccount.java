package OOP.MoodleTwo.LessonFive.TaskThird;

public abstract class BankAccount {

    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0)
            this.balance = this.balance + balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}
