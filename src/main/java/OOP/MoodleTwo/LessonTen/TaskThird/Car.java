package OOP.MoodleTwo.LessonTen.TaskThird;

public class Car{
    private String colar;
    private String model;
    private String number;

    public Car(String colar, String model, String number) {
        this.colar = colar;
        this.model = model;
        this.number = number;
    }

    public String getColar() {
        return colar;
    }

    public void setColar(String colar) {
        this.colar = colar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
               "colar='" + colar + "'" +
               ", model='" + model + '\'' +
               ", number='" + number + '\'' +
               '}' + "\n";
    }



}
