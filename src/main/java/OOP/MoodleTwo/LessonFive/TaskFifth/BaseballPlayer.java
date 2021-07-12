package OOP.MoodleTwo.LessonFive.TaskFifth;

public class BaseballPlayer extends Player {
    int atBats;
    int hits;

    public BaseballPlayer(int atBats, int hits) {
        this.atBats = atBats;
        this.hits = hits;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public double battingAverage() {
        return (double) hits / atBats;
    }


    @Override
    public String getSport() {
        return null;
    }

    @Override
    public void setSport(String sport) {

    }

    @Override
    public String getTeam() {
        return null;
    }

    @Override
    public void setTeam(String team) {

    }

    @Override
    public String getPosition() {
        return null;
    }

    @Override
    public void setPosition(String position) {

    }

    @Override
    public String getFirst() {
        return null;
    }

    @Override
    public void setFirst(String first) {

    }

    @Override
    public String getLast() {
        return null;
    }

    @Override
    public void setLast(String last) {

    }
}
