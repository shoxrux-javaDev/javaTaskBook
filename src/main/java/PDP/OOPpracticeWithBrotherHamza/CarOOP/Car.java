package PDP.OOPpracticeWithBrotherHamza.CarOOP;

public class Car {
    // * Properties, Fields - STATE, IDENTITY - Hususiyatlari => variables
    private int regNumber;
    private String chassisNumber;
    private String owner;
    private String colour;
    private String brand;
    private String model;

    // constructor
    public Car(int regNumber2, String chassisNumber2, String owner2) {
        this.regNumber = regNumber2;
        this.chassisNumber = chassisNumber2;
        this.owner = owner2;
    }

    public Car(int regNumber, String chassisNumber, String owner, String colour, String brand, String model) {
        this.regNumber = regNumber;
        this.chassisNumber = chassisNumber;
        this.owner = owner;
        this.colour = colour;
        this.brand = brand;
        this.model = model;
    }

    public Car() {
        this.regNumber = 0;
        this.chassisNumber = "empty";
        this.owner = "Egasi yo'q";
    }

    public int getRegNumber() {
        return this.regNumber;
    }

    public String getOwner() {
        return this.owner;
    }


    // Behavior - Qobiliyatlari => methods
    public void start() {

    }

    public void move() {

    }

    public void stop() {

    }
}
