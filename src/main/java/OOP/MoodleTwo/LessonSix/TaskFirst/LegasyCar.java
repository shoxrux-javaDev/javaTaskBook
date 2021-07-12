package OOP.MoodleTwo.LessonSix.TaskFirst;

public class LegasyCar implements Car {
    private String name;
    private String model;
    private String cost;

    public LegasyCar(String name, String model, String cost) {
        this.name = name;
        this.model = model;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public void start() {
        System.out.println(getName()+" car can't star with owner voice ");
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        System.out.println(getName()+" car can stop 10 m");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" car can't fly");
    }
}
