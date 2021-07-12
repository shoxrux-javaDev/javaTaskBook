package OOP.MoodleTwo.LessonNine.TaskNine;
import java.util.Scanner;

public class TextDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("birinchi matni kiriting: ");
        String str1 = scanner.nextLine().replaceAll(" ", "");
        System.out.print("ikkinchi matni kiriting: ");
        String str2 = scanner.nextLine().replaceAll(" ", "");
        String result = str1.replaceAll(str2, "");
        Text_Interface<String> find_text = (thisText) -> {
            if (str1.length() > str2.length()) {
                if (str1.length() != result.length()) {
                    return "mavjud!";
                }else{
                    return "mavjud emas";
                }
            } else {
                return "1va 2 matn bir xil";
            }
        };
        System.out.println(find_text.checkText(result));
    }
}
