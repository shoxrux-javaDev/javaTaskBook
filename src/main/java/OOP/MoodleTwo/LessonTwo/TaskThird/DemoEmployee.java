package OOP.MoodleTwo.LessonTwo.TaskThird;

/*Quyidagi attributelardan iborat Employee klassini encapsulation prinsipi
asosida yarating: identifikasiya raqami, ismi, familiyasi va oyligi.*/
public class DemoEmployee {
    public static void main(String[] args) {
        Employee worker = new Employee("33042125458745245132", "Sindarov", "Shoxrux", 18000000);

        worker.getOwnName();
        worker.getOwnSurname();
        worker.getFee();
        worker.getIdentfy();

    }
}
