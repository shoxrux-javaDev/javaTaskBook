package OOP.MoodleTwo.LessonFive.TaskFifth;

public class Pitcher extends BaseballPlayer{

    int innings;
    int earnedRuns;

    public Pitcher(int atBats, int hits, int innings, int earnedRuns) {
        super(atBats, hits);
        this.innings = innings;
        this.earnedRuns = earnedRuns;
    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }
}
