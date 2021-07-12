package OOP.MoodleTwo.LessonOne.TaskThird;

public class SolutionAtribut {
    private double firstAtribut;
    private double secondAttribut;


    public SolutionAtribut(double firstAtribut, double secondAttribut) {
        this.firstAtribut = firstAtribut;
        this.secondAttribut = secondAttribut;
    }

    public double[] aboutAttributes() {
        double[] doubleAtribut = new double[2];
        doubleAtribut[0] = firstAtribut;
        doubleAtribut[1] = secondAttribut;
        return doubleAtribut;
    }

    public double sumAttributes() {
        return firstAtribut + secondAttribut;
    }

    public double maxAttribute() {
        return Math.max(firstAtribut, secondAttribut);
    }
}
