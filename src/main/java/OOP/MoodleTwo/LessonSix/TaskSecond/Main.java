package OOP.MoodleTwo.LessonSix.TaskSecond;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("layla","female","John");
        Tiger tiger = new Tiger("Zoya","tiger","Australia");
        Cat cat =new Cat("Masha","cat","Hilola");
        dog.run();
        dog.guard();
        dog.eat();
        dog.sound();
        System.out.println("\n");
        tiger.sound();
        tiger.run();
        tiger.attack();
        tiger.eat();
        System.out.println("\n");
        cat.eat();
        cat.run();cat.sound();
    }
}
