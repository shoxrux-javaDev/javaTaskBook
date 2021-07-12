package OOP.MoodleTwo.LessonFive.TaskSecond;

public abstract class Aircraft {

    String color;
    Object engine;

    public Aircraft(String color, Object engine) {
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Object getEngine() {
        return engine;
    }

    public void setEngine(Object engine) {
        this.engine = engine;
    }

    abstract void start();

    abstract void stop();

    abstract void takeOff();

    abstract void land();


}
