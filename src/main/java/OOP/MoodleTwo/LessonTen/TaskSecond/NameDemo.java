package OOP.MoodleTwo.LessonTen.TaskSecond;

import java.util.*;

public class NameDemo {
    public static List<Name> name = new ArrayList<>();
    public static boolean b = true;
    public static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        name.add(0, new Name("Shoxrux"));            //1-2-3 shart bajarildi
        name.add(1, new Name("Bobur"));
        name.add(2, new Name("Saidolim"));
        name.add(3, new Name("Abror"));
        name.add(4, new Name("Kamol"));
        name.add(5, new Name("Behzod"));
        name.add(6, new Name("Lochin"));
        name.add(7, new Name("Kamron"));
        name.add(8, new Name("Marjona"));
        name.add(9, new Name("Xolmat"));
        String surName = "Sindarov";                      //4 shart bajarildi
        name.set(1, new Name(surName));
        Object[] arr = name.toArray();
//        arr[0]=null;
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println("=======================================================");
        name.remove(0);
        name.remove(0);

        name.forEach(name1 -> {
            if (name1.getName().equals("Behzod"))
                b = false;


            if (b)
                name.set(index++, null);
        });

        name.removeIf(Objects::isNull);

        System.out.print(name);


    }
}
