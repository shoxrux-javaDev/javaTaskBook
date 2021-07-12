package OOP.MoodleTwo.LessonElleven.TaskFirst;

import java.util.HashSet;
import java.util.Set;

public class DemoString {
    public static void main(String[] args) {
        Set<StringClass> numberSet = new HashSet<>();
        numberSet.add(new StringClass("O'n bir"));
        numberSet.add(new StringClass("O'n ikki"));
        numberSet.add(new StringClass("O'n ming"));
        numberSet.add(new StringClass("O'n uch"));
        numberSet.add(new StringClass("O'n sakkiz"));
        numberSet.add(new StringClass("O'n besht"));
        numberSet.add(new StringClass("Yigirma"));
        numberSet.add(new StringClass("O'ttiz to'rt"));
        numberSet.add(new StringClass("sakson"));
        numberSet.add(new StringClass("yuz"));

       /* Iterator<StringClass> iterator = numberSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        numberSet.forEach(number-> System.out.println(number.getNumbers()));
    }
}
