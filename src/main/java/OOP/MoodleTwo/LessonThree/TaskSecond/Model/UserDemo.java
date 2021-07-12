package OOP.MoodleTwo.LessonThree.TaskSecond.Model;

        /*Model package ini ichida quyidagicha atributlari bor bo’lgan User klassini yarating:
        id,  username(public), email(public), password(private),  name, address.
        Parolni o’zgartiradigan changePassword methodini yarating.
        Bunda eski parol kiritiladi agar u to’g’ri bo’lsa yangi parol kiritish mumkin bo’lsin.*/

import java.util.Scanner;

public class UserDemo {
    static int index = 0, number = 0, count = 0;
    public static User[] users = new User[200];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.saytga kirish");
            System.out.println("2.ro'yhatdan o'tish");
            System.out.println("3.chiqish");
            int choiceOne = scanner.nextInt();
            switch (choiceOne) {
                case 1:
                    enterToSide();
                    break;
                case 2:
                    Regist();
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void enterToSide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("loginingizni kiriting: ");
        String login = scanner.nextLine();
        boolean found = false;
        for (User user : users) {
            if (user != null) {
                if (user.checkLogin(login)) {
                    scanner = new Scanner(System.in);
                    System.out.println("parolingizni kiriting: ");
                    String firstPasword = scanner.nextLine();
                    if (user.chekPassword(firstPasword)) {
                        System.out.println("Welcome to System!\n");
                        welcomeToSytem(user);
                        found = true;
                    } else {
                        System.out.println("parol noto'gri kiritildi!");
                        break;
                    }
                }
            }
        }
        if(!found) {
            System.out.println("Registratsiyadan o'tmagansiz");
        }
    }

    public static void Regist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("emailingizni kiriting: ");
        String email = scanner.nextLine();
        System.out.println("loginingizni kiriting: ");
        String username = scanner.nextLine();
        System.out.println("parolingizni kiriting: ");
        String password = scanner.nextLine();
        System.out.println("adressingizni kiriting: ");
        String adress = scanner.nextLine();
        System.out.println("ismingizni kiriting: ");
        String name = scanner.nextLine();
        users[index] = new User(index, email, username, password, adress, name);
        index++;
        System.out.println("Tabriklaymiz ro'yhatdan o'tingiz");
    }

    public static void welcomeToSytem(User user) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.pasword almashtrish");
            System.out.println("2.ma'lumotlarimni ko'rish");
            System.out.println("3.chiqish");
            String choiceNumber = scanner.nextLine();
            switch (choiceNumber) {
                case "1":
                    System.out.println("eski parolingizni kriting:");
                    String curentPassword = scanner.nextLine();
                    if ((curentPassword) != null) {
                        if (user.changePassword(curentPassword)) {
                            System.out.println("yangi parolni kriting:");
                            String newPassword = scanner.nextLine();
                            user.setPassword(newPassword);
                            System.out.println("parol o'zgartirildi" + " " + user.getPassword());
                            break;
                        } else {
                            System.out.println("eski parolni takrorladingiz!");
                            break;
                        }
                    } else {
                        System.out.println("parolni to'gri kirgizing");
                        continue;
                    }
                case "2":
                    System.out.println(user.toString());
                    break;
                case "3":
                    return;
            }
        }
    }
}


