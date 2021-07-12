package OOP.MoodleTwo.LessonFive.TaskThird;

public class CheckingAccount extends BankAccount {


    public CheckingAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    void deposit(double amount) {
        setBalance(amount);
        System.out.println(getOwner()+" hisobingizga "+amount+" pul qo'shildi balansingizda "+getBalance()+" miqdorda pul bor");
    }

    @Override
    void withdraw(double amount) {
        balance=getBalance()-amount;
        System.out.println(getOwner()+" hisobingizdan "+amount+" pul yechildi va"+getBalance()+" miqdorda pul qoldi");
    }



    public boolean check() {
        return getBalance() > 0;
    }

}
