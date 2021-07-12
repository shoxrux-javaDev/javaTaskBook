package PDP.OOPpracticeWithBrotherHamza.CarOOP;

public class Main {

    public static void main(String[] args) {

        Car nexia = new Car(445566, "XWB456456654", "Khamza Kuranbayev", "White", "Chevrolet", "Ravon");

        Car man = new Car(998877, "XWB65454564564", "Shokir Jumaniyazov");

        System.out.println("Nexianing regNumber: " + nexia.getRegNumber() + " Nexia Egasi:" + nexia.getOwner() +
                "\nMan ning regNumber: " + man.getRegNumber()+ " Nexia Egasi:" + man.getOwner());

    }

}
