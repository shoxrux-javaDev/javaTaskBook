package OOP.MoodleTwo.LessonSix.TaskThird;

public class Sedan implements CargoAuto,PassengersAuto {
    private String model;
    private String weight;
    private String owner;
    private int cost;

    public Sedan(String model, String weight, String owner, int cost) {
        this.model = model;
        this.weight = weight;
        this.owner = owner;
        this.cost = cost;
    }

    @Override
    public void transportPassengers() {
        System.out.println(" bu mashina haqida ma'lumotga ega emasman");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
