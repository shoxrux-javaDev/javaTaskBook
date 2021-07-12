package OOP.MoodleTwo.LessonFive.TaskSecond;

public class PassengerPlane extends Aircraft{
    int passenger;

    public PassengerPlane(String color, Object engine, int passenger) {
        super(color, engine);
        this.passenger = passenger;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    @Override
    public void start() {
        System.out.println("Harbiy havo kemasining rangi "+getColor()
                +" matori "+getEngine()+" versiyada "+getPassenger()+"kishiga moslashtirilgan");
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
