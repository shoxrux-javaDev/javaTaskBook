package OOP.MoodleTwo.LessonTen;

import java.util.ArrayList;
import java.util.Collection;

public class UsingCollection{

    public static void main(String[] args) {

        // bunday collectionga qiymat qo'shish bizga noqulayliklarni tug'diradi
// chunki har hil tipdagi narsalrni bir joyda saqlash qiyinchilik tu'gdiradi
        Collection  collection= new ArrayList();
        collection.add(1500);
        collection.add(true);
        collection.add(12.32);
        collection.add("s");
        collection.add('f');
        //System.out.println(collection);

        //Collection add(item) bunda item qo'sha olsa true aksi bo'lsa false qataradi
        System.out.println(collection.add(2200));  // bunda console da true bo'ladi 2200 qo'sha olgani uchun

       /* Collection ni addAll metothdi bu bizga collection methodiga narsalarni collection1 b-n
         ketma ketlikda qo'shish imkonini beradi*/

        Collection collection1=new ArrayList();
        collection1.addAll(collection);
        collection1.add("otherNumber1");
        collection1.add("otherNumber2");
        collection1.add("otherNumber3");
        System.out.println(collection1);

        // boolean remove(object item) bu ko'rsatilgan obyektni collectionda o'chiradi listlarda index bilan bajariladi
        collection1.remove(12.32);
        System.out.println(collection1);

        // boolean removeAll(Collection<?> col)
        collection1.removeAll(collection);
        System.out.println(collection1);





    }
}
