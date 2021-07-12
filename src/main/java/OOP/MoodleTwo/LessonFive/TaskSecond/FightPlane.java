package OOP.MoodleTwo.LessonFive.TaskSecond;

public class FightPlane extends Aircraft {
    Object engine;

    public FightPlane(String color, Object engine) {
        super(color, engine);
    }


    public void show(){
        System.out.println("Salom do'stlar");
    }

    @Override
    public void start() {
        System.out.println("Harbiy havo kemasining rangi "+getColor()+" matori "+getEngine()+" versiyada");
    }

    @Override
    public void stop() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }
}
