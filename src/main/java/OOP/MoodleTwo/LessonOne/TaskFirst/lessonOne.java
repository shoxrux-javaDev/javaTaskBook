package OOP.MoodleTwo.LessonOne.TaskFirst;

/*X va Y koordinatalarni ifodalovchi atrributlari bor bo’lgan Point klassini yarating.
“(45, 56)” shakldagi ma’lumot(X va Y)ni chop etuvchi printXY methodini yarating.*/
public class lessonOne {
    public static void main(String[] args) {
        Point point = new Point(45,56);
        System.out.println("natija="+point.printXY()[0]+" va "+point.printXY()[1]);

    }


}
