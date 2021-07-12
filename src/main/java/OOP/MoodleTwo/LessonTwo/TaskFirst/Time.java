package OOP.MoodleTwo.LessonTwo.TaskFirst;

public class Time {
    private String clock;
    private String minutes;
    private String secund;

    public Time(String clock, String minutes, String secund) {
        this.clock = clock;
        this.minutes = minutes;
        this.secund = secund;
    }

  public void getTime(){
      System.out.println("natija = "+this.clock+":"+this.minutes+":"+this.secund);
  }
}
