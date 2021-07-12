package OOP.MoodleThree.LessonOne.TaskTwo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Side east= Side.EAST;
        Side west= Side.WEST;
        Side north= Side.NORTH;
        Side south= Side.SOUTH;
        System.out.print("Samalyotni og'ish burchagini toping : \n");
        System.out.println("1.\n2.\n3.\n4.");
        int choiceSide = scanner.nextInt();
        switch (choiceSide) {
            case 1:
                System.out.println("Siz tanlagan yo'nalishda "+west.polesName()+" ga 13 daraja");
                break;
            case 2:
                System.out.println("Siz tanlagan yo'nalishda "+west.polesName()+" ga 15 daraja");
                break;
            case 3:
                System.out.println("Siz tanlagan yo'nalishda "+west.polesName()+" ga 30 daraja");

                break;
            case 4:
                System.out.println("Siz tanlagan yo'nalishda "+west.polesName()+" ga 45 daraja");
                break;
        }
    }
}
