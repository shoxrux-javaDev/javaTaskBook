package OOP.MoodleTwo.LessonSix.TaskFirst;

public class Main {
    public static void main(String[] args) {
        LegasyCar legasyCar = new LegasyCar("gentra","chevrolet","900000000");
        FutureCar futureCar = new FutureCar("FlyTesla","Tesla","900000000000");
        legasyCar.fly();
        legasyCar.start();
        legasyCar.stop();
        legasyCar.run();
        futureCar.fly();
        futureCar.run();
        futureCar.start();
        futureCar.stop();
    }
}
