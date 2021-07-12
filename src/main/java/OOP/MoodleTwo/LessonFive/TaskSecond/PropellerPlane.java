package OOP.MoodleTwo.LessonFive.TaskSecond;

public class PropellerPlane extends Aircraft {
    int propeller;

    public PropellerPlane(String color, Object engine, int propeller) {
        super(color, engine);
        this.propeller = propeller;
    }

    public int getPropeller() {
        return propeller;
    }

    public void setPropeller(int propeller) {
        this.propeller = propeller;
    }

    @Override
    public void start() {
        System.out.println("Harbiy havo kemasining rangi "+getColor()+" matori "+getEngine()+" versiyada "+getPropeller()+"kishiga moslashtirilgan");

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
