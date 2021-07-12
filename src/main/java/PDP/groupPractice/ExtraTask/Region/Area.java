package PDP.groupPractice.ExtraTask.Region;

public class Area {
    protected String name;
    protected double size;
    protected long population;

    public Area(String name, double size, long population) {
        this.name = name;
        this.size = size;
        this.population = population;
    }

    public void printInfo() {
        System.out.println("\nInfo");
        System.out.println("-------------------------------------------------------");
        System.out.println("Area: " + name + " | " + "Area size: " + size + " | " + "Area population: " + population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

}