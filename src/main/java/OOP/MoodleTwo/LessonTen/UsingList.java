package OOP.MoodleTwo.LessonTen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingList {
    public static void main(String[] args) {
         /* ArrayList<String> animal=new ArrayList<>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Monkey");
        System.out.println("Animal"+animal);*/

        // List collection
        List<Integer> list= new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);

        // System.out.println(list);
        System.out.println(list.add(12));   // list ga bir elementni qo'sha olsak true beradi

        //Listni massivga o'xshatib bir qatorda yozish usuli

      /*  biz list collection ni pustoy yasaganimizda u opirativkadan 10 ta joy egallaydi
        o'nta to'lsa o'ntani yarmicha joy qo'shib qo'yadi o'nbeshta to'lsa 15 tani
        yarmicha qo'shadi */

        List<String> list1 = new ArrayList<>(Arrays.asList(
                "one","two","three","..."
        ));
        System.out.println(list1);

        /* unga o'zimiz ham qiymat bersak bo'ladi initialCapacity
         deyiladi bunda prosta qiymat beriladi bu chegara emas
         100 ga kelgach 100 ni yarmicha joyni o'zi ochib oladi*/
        List<Integer> list2=new ArrayList<>(100);
        list2.add(4);
        list2.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(1);
        // void clear();  bu collectionlarni bo'shatib qo'yadi o'chirib yuboradi hamma ma'lumotni
        /*list2.clear();
        System.out.println(list2);*/

        // boolean contains (Object item) bu biz so'ragan ma'lumotni collectionda qidiradi topsa true bo'lmasa false beradi
        /*boolean containssss = list2.contains(5);
        System.out.println(containssss);*/

        // boolean isEmpty()- bu collection bo'sh bo'smasligini tekshiradi
//        list2.clear();
        /*boolean empty=list2.isEmpty();
        System.out.println(empty);*/

        // boolean remove (Object item) bu bizga bergan indexdagi obyektimizni collection dan o'chirib beradi
        Integer removeee=list2.remove(2);


    }
}
