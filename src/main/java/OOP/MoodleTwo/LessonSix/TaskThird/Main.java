package OOP.MoodleTwo.LessonSix.TaskThird;

public class Main {
    public static void main(String[] args) {
        Truck truck =new Truck("Man","90","Baxodir",250000);
        Pick pick =new Pick("Man","75","Sattor",200000);
        Sedan sedan =new Sedan("Man","80","Rustam",220000);
        truck.transportCargo();
        pick.transportCargo();
        pick.transportPassengers();
        sedan.transportPassengers();

    }
}
