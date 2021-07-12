package OOP.MoodleTwo.LessonFive.TaskFifth;

public class SoccerPlayer extends Player{
    int minutes;
    int goals;

    public SoccerPlayer(int minutes, int goals) {
        this.minutes = minutes;
        this.goals = goals;
    }

    public void goalPerGame(){

    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
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
