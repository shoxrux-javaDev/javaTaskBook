package OOP.MoodleTwo.LessonFive.TaskFourth;

public class SalariedEmployee extends Person implements Office{

    double weeklyPay;

    public SalariedEmployee(String name, String address, String hairColor, String eyeColor, double weeklyPay) {
        super(name, address, hairColor, eyeColor);
        this.weeklyPay = weeklyPay;
    }


    void setWage() {

    }

    void moveOffice(){

    }

    @Override
    public void setNumber() {

    }

    @Override
    public void getNumber() {

    }

    @Override
    public void setOccupant() {

    }

    @Override
    public void getOccupant() {

    }
}
