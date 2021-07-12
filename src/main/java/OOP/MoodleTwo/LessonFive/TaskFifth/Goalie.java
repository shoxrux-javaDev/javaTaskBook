package OOP.MoodleTwo.LessonFive.TaskFifth;

public class Goalie extends SoccerPlayer{

    int goalsAllowed;
    double averageGoalsAllowed;

    public Goalie(int minutes, int goals, int goalsAllowed, double averageGoalsAllowed) {
        super(minutes, goals);
        this.goalsAllowed = goalsAllowed;
        this.averageGoalsAllowed = averageGoalsAllowed;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public double getAverageGoalsAllowed() {
        return averageGoalsAllowed;
    }

    public void setAverageGoalsAllowed(double averageGoalsAllowed) {
        this.averageGoalsAllowed = averageGoalsAllowed;
    }
}
