package OOP.MoodleTwo.LessonTen.TaskFirst;

import java.util.ArrayList;
import java.util.List;

public class DemoAlphabet {
    public static void main(String[] args) {

        List<NameOrder> nameOrder = new ArrayList<>();
        nameOrder.add(0,new NameOrder("Bohodir"));
        nameOrder.add(1,new NameOrder("Sardor"));
        nameOrder.add(2,new NameOrder("Salim"));
        nameOrder.add(3,new NameOrder("Kamron"));
        nameOrder.add(4,new NameOrder("Kamol"));
        nameOrder.add(5,new NameOrder("Jamol"));
        nameOrder.add(6,new NameOrder("Sanjar"));
        nameOrder.add(7,new NameOrder("Doston"));
        nameOrder.add(8,new NameOrder("Alisher"));
        nameOrder.add(9,new NameOrder("Murod"));

        List<NameOrder> nameOrder1=new ArrayList<>(nameOrder);
        nameOrder1.add(0,new NameOrder("Axror"));
        nameOrder1.add(1,new NameOrder("Burxon"));
        nameOrder1.add(2,new NameOrder("Temur"));
        System.out.println(nameOrder1);
    }
}
