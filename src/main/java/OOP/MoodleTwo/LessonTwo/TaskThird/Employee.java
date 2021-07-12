package OOP.MoodleTwo.LessonTwo.TaskThird;

public class Employee {
    private String NumberIndentfy;
    private String surname;
    private String name;
    private int feelMoney;

    public Employee(String numberIndentfy, String surname, String name, int feelMoney) {
        NumberIndentfy = numberIndentfy;
        this.surname = surname;
        this.name = name;
        this.feelMoney = feelMoney;
    }

    public void getIdentfy(){
        System.out.println("idnetifakatsiya raqamingiz:"+this.NumberIndentfy);
    }

    public void getOwnName() {
        System.out.println("sizning ismingiz: "+this.name);
    }
    public void getOwnSurname(){
        System.out.println("sizning familiyangiz: "+this.surname);
    }
    public void getFee(){
        System.out.println("sizning oylik maoshingiz: "+this.feelMoney);
    }
}
