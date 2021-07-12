package OOP.MoodleTwo.LessonOne.TaskSecond;


     /*   To’g’ri burchakli uchburchak klassini yarating.
        Uning barcha atributlari va methodlariga mos nom va toifa tanlang.
        (Eni va bo’yi attributlari,Perimetrini va Yuzasini hisoblaydigan 2ta methodi bo’lsin).*/

public class RightTriangle {
    public static void main(String[] args) {

        TriangleSolution getSolution=new TriangleSolution (6,10,"uchburchakning peremtri:");
        System.out.print("uchburchaknint yuzi:"+getSolution.getFace()+"\n"
                +getSolution.getStringPeremetr()+getSolution.getPeremtr());
    }
}
