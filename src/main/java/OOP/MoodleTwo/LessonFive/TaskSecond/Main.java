package OOP.MoodleTwo.LessonFive.TaskSecond;

public class Main {
    public static void main(String[] args) {

        FightPlane fightPlane=new FightPlane("white","Turbulent");
        Aircraft passangerPlane= new PassengerPlane("Green","Turbo",200);
        PropellerPlane propeller =new PropellerPlane("Red","Simple",30);
        passangerPlane.start();
        propeller.start();
        fightPlane.show();


    }
}
