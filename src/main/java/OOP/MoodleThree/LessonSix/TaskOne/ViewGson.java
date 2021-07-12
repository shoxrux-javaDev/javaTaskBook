package OOP.MoodleThree.LessonSix.TaskOne;

import com.google.gson.Gson;

import java.io.*;
import java.util.*;

public class ViewGson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        int count = 1,length=0;
        String emailOfUser = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/comments.json"));
            List<User> users = Arrays.asList(gson.fromJson(bufferedReader, User[].class));
            System.out.println(users.size());
            Set<Integer> post = new HashSet<>();
            for (int i = 0; i <= 100; i++) post.add(users.get(i).getPostId());
            System.out.println(post.size());
//            for (User name : users) System.out.println(count++ + "." + "name=" + name.getName());
//            for (User name : users) System.out.println(count++ + "." + "email=" + name.getEmail());
            for (User user : users) {
                if (length < user.getBody().length()) {
                    length = user.getBody().length();
                    emailOfUser = user.getEmail();
                }
            }
            System.out.println("the longest comment belongs to "+emailOfUser+" and the lengths of comment "+(length-1));


            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
