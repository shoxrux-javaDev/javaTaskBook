package OOP.MoodleTwo.LessonTwo.TaskFirst;

        /*Quyidagi 3ta attribute bor bo’lgan Time klassini encapsulation prinsipi
        asosida yarating:soat, minut, va sekund.“soat:minut:sekund”
        (Masalan: 01:25:08) formatdagi vaqtni qaytaruvchi mehod yarating.*/

public class TimeDemo {
    public static void main(String[] args) {

        Time time=new Time(" 05","17","09");
        time.getTime();
    }
}
