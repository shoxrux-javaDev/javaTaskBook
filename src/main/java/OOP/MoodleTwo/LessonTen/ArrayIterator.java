package OOP.MoodleTwo.LessonTen;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayIterator implements java.util.Iterator {
    private int current;
    private Object[] items;

    public ArrayIterator(Object[] items) {
        this.current = 0;
        this.items = items;
    }

    public boolean hasNext() {
        return (current < items.length);
    }

    public  Object next() {
        return items[current++];
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        String[] strings = {"Bob", "Ann", "Sally", "Sue"};
        Integer[] ints = {1, 2, 3, 4, 5};
        ArrayIterator ai = new ArrayIterator(strings);
        while(ai.hasNext()) {
            System.out.println(ai.next());
        }
        ai = new ArrayIterator(ints);
        while(ai.hasNext()) {
            System.out.println(ai.next());
        }
        ArrayList al1 = new ArrayList();
        al1.add("one");al1.add("two");
        al1.add("three");
        Iterator i = al1.iterator();
        String l;
        while(i.hasNext()) {
            l =(String)i.next();
            System.out.println(l.substring(1)+" ");
        }

        ArrayList<String> al2=new ArrayList<>();
        al2.add("Salom");
        al2.add("Xayr");
        al2.add("xush kelibsiz");
        System.out.println(al2);

        Iterator<String> iter=al2.iterator();
        String ll;
        while(iter.hasNext()){
          ll=iter.next();
            System.out.println(ll);
        }


    }
}
