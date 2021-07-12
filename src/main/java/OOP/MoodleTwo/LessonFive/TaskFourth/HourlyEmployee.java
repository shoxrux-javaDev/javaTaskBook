package OOP.MoodleTwo.LessonFive.TaskFourth;

public class HourlyEmployee extends Person {

    double hourlyRate;
    int jobId;

    public HourlyEmployee(String name, String address, String hairColor, String eyeColor,
                          double hourlyRate, int jobId) {
        super(name, address, hairColor, eyeColor);
        this.hourlyRate = hourlyRate;
        this.jobId = jobId;
    }

    void setRate(){

    }

}
