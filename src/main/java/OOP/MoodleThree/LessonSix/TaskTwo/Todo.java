package OOP.MoodleThree.LessonSix.TaskTwo;

import com.google.gson.Gson;

import java.io.*;
import java.util.*;

public class Todo {
    public static Scanner scanner = new Scanner(System.in);
    public static List<UserInform> userInformList = new ArrayList<>();

    public static void main(String[] args) {
        // CRUD
        // C - Create
        // R - Read
        // U - Update
        // D - Delete
        int count = 0;
        Gson gson = new Gson();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/todos.json"));
            userInformList.addAll(Arrays.asList(gson.fromJson(reader, UserInform[].class)));
            while (true) {
                System.out.println("1. Add");
                System.out.println("2. Get All");
                System.out.println("3. Get By Id");
                System.out.println("4. Edit");
                System.out.println("5. Delete");
                System.out.println("6. Exit");
                System.out.println("choose the section: ");
                String number = scanner.nextLine();
                choseNumber(number);
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void choseNumber(String number) {
        switch (number) {
            case "1":
                System.out.print("Enter userId: ");
                Integer userId = scanner.nextInt();
                System.out.print("enter title: ");
                scanner = new Scanner(System.in);
                String title = scanner.nextLine();
                Integer id = userInformList.size() + 1;
                userInformList.add(new UserInform(userId, id, title, false));
                System.out.println("adding successful!");
                break;
            case "2":
                System.out.println("All todo list...");
                System.out.println("====================================================================");
                for (UserInform user : userInformList) {
                    System.out.println(user);
                }
                break;
            case "3":
                System.out.print("Enter userId: ");
                Integer getUserId = scanner.nextInt();
                for (UserInform falseTodo : userInformList) {
                    if (!falseTodo.isCompleted() && falseTodo.getUserId().equals(getUserId)) {
                        System.out.println(falseTodo.toString() + " || To do is " + falseTodo.isCompleted());
                    }
                }
                System.out.println("===================================================================");
                for (UserInform falseTodo : userInformList) {
                    if (falseTodo.isCompleted() && falseTodo.getUserId().equals(getUserId)) {
                        System.out.println(falseTodo.toString() + " || To do is " + falseTodo.isCompleted());
                    }
                }
                break;
            case "4":
                System.out.print("enter id: ");
                Integer newId = scanner.nextInt();
                System.out.println("what you want edit:\n1.userId\n2.completed\n3.title");
                int chooseEdit = scanner.nextInt();
                choseingEdit(chooseEdit, newId);
                break;
            case "5":
                System.out.print("enter id : ");
                Integer deleteId=scanner.nextInt();
                userInformList.removeIf(willRemove -> willRemove.getId().equals(deleteId));
                break;
            case "6":
                break;
        }
    }

    private static void choseingEdit(int chooseEdit, Integer newId) {
        switch (chooseEdit) {
            case 1:

                System.out.print("enter new userId: ");
                Integer newUserId = scanner.nextInt();
                for (UserInform oldUserId : userInformList) {
                    if (oldUserId.getId().equals(newId)) {
                        oldUserId.setId(newUserId);
                    }
                }
                break;
            case 2:
                System.out.print("enter completed: (true or false) ");
                boolean newCompleted = scanner.nextBoolean();
                for (UserInform oldUserId : userInformList) {
                    if (oldUserId.getId().equals(newId)) {
                        oldUserId.setCompleted(newCompleted);
                    }
                }
                break;
            case 3:
                System.out.print("enter title: ");
                String newTitle = scanner.nextLine();
                for (UserInform oldUserId : userInformList) {
                    if (oldUserId.getId().equals(newId)) {
                        oldUserId.setTitle(newTitle);
                    }
                }
                break;
            default:
                System.out.println("you chose another number!");
                break;
        }
    }
}
