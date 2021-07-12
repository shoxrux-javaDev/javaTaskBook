package OOP.MoodleTwo.LessonOne.TaskSecond;

public class TriangleSolution {
    private int katet_a;
    private int katet_b;
    private String Peremetr;


    public TriangleSolution(int katet_b, int katet_a, String Peremetr) {
        this.katet_a = katet_a;
        this.katet_b = katet_b;
        this.Peremetr = Peremetr;
    }

    public double getPeremtr() {
        double getGepatenuza = Math.sqrt(Math.pow(this.katet_a, 2) + Math.pow(this.katet_b, 2));

        return Math.round(getGepatenuza + this.katet_a + this.katet_b);
    }

    public double getFace() {
        return (double)(this.katet_a* this.katet_b)/2;
    }
    public String getStringPeremetr(){
        return this.Peremetr;
    }
}
