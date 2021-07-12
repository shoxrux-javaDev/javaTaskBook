package OOP.MoodleThree.LessonSix.TaskThree;

import com.google.gson.Gson;
import java.io.*;
import java.util.*;

public class GeoCompanyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new Gson();
        List<UserInform> userList=new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/users.json"));

            System.out.print("enter name or email: ");
            String nameWithEmail = scanner.nextLine();
            for (UserInform user : userList) {
                if (user.getName().equals(nameWithEmail)||user.getEmail().equals(nameWithEmail)) {
                    System.out.println("company of user: \n1."+user.company.getName()+"\n2."+
                                       user.company.getCatchPhrase()+"\n3."+user.company.getBs());
                    System.out.println("===========================================================");
                    System.out.println("geographic reference of user: \n1."+user.address.geo.getLat()+
                                       "\n2."+user.address.geo.getLng());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
