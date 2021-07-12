package OOP.MoodleTwo.LessonOne.TaskFirst;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public int[] printXY(){
        int[] res = new int[2];
         res[0]=x;
         res[1]=y;
        return res;
    }

}
