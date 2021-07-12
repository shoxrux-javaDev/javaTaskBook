package OOP.MoodleTwo.LessonTen.TaskFourth;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class AlphabetDemo {

    public static void main(String[] args) {

        List<Name> nameList = new LinkedList<>();
        nameList.add(new Name("Abbos"));
        nameList.add(new Name("Bobur"));
        nameList.add(new Name("Sodiq"));
        nameList.add(new Name("Mamur"));
        nameList.add(new Name("Kamol"));
        nameList.add(new Name("Akmal"));
        nameList.add(new Name("Jo'rabek"));
        nameList.add(new Name("Atxam"));
        nameList.add(new Name("Murod"));
        nameList.add(new Name("Anvar"));
        for(Name name1:nameList)
        System.out.println(name1);
        System.out.println("=====================================================");
        nameList.sort(Comparator.comparing(Name::getName));
        nameList.removeIf(name -> name.getName().charAt(0)=='A');
        for (Name name : nameList) {
            System.out.println(name);
        }



    }
}
