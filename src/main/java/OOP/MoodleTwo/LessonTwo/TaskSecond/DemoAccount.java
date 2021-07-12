package OOP.MoodleTwo.LessonTwo.TaskSecond;

     /*   Quyidagi attributelardan iborat Account klassini encapsulation
        prinsipi asosida yarating: hisob raqami, ism familiyasi va balans.*/

public class DemoAccount {
    public static void main(String[] args) {
        Account showBalance= new Account("shoxrux","sindarov",7898400);
        showBalance.getName();
        showBalance.getSurname();
        showBalance.getBalance();

    }
}
