/*
package Practice.Repitition;

*/
/*Massiv ichida berilgan son bor yo’qligini aniqlaydigan dastur tuzing.*//*


import java.util.Scanner;

public class RepeatArray {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        int outNumber = arr.nextInt();
        System.out.println(getArray(outNumber));
    }

    public static boolean getArray(int outside) {
        int[] number = {2, 3, 4, 5, 6, 7, 43, 2, 34,};
        for (int item : number) {
            if (item == outside) {
                return true;
            } else {
                return false;
            }
        }

    }
}
*/
