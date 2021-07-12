package PDP.groupPractice.ExtraTask.OlxExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainDemo {
    public static List<User> userList = new LinkedList<>();
    public static List<Region> regionList = new ArrayList<>();
    public static List<District> districtList = new ArrayList<>();
    public static List<Category> categoryList = new ArrayList<>();
    public static List<SubCategory> subCategoryList = new ArrayList<>();
    public static List<Announcement> announcementList = new LinkedList<>();
    public static List<Message> messageList = new LinkedList<Message>();
    public static Scanner scanner = new Scanner(System.in);
    public static User onlineUser = null;
    public static int messageId = 1, announcementId = 1, index2 = 1, countAnnounce = 0, i = 0;

    public static void main(String[] args) {
        RegionInfo();
        DistrictInfo();
        UserInfo();
        CategoryInfo();
        subCategoryInfo();
        boolean enter = true;
        while (enter) {
            System.out.println("1.Sign in");
            System.out.println("2.Sign up");
            System.out.println("3.Exit");
            int chooseOne = scanner.nextInt();
            boolean door = true;
            while (door) {
                switch (chooseOne) {
                    case 1:
                        signIn();
                        door = false;
                        break;
                    case 2:
                        signUp();
                        door = false;
                        break;
                    case 3:
                        return;
                }
            }
        }
    }

    public static void signUp() {
        boolean door1 = true;
        while (door1) {
            scanner = new Scanner(System.in);
            System.out.print("Name: ");
            boolean door2 = true;
            String signName = scanner.nextLine();
            for (User names : userList) {
                if (names.getName().equals(signName)) {
                    System.out.println("this name is available on the network");
                    door2=false;
                    break;
                }
            }
            while (door2) {
                System.out.print("Password: ");
                String signPassword = scanner.nextLine();
                boolean door3 = true;
                while (door3) {
                    if (signPassword != null && signPassword.length() >= 6) {
                        System.out.print("Phone: ");
                        String signPhone = scanner.nextLine();
                        boolean door4 = true;
                        while (door4) {
                            int count = 0;
                            for (int i = 0; i < signPhone.length(); i++) {
                                if (Character.isDigit(signPhone.charAt(i))) {
                                    count++;
                                }
                            }
                            if (count == signPhone.length()) {
                                scanner = new Scanner(System.in);
                                System.out.print("Email: ");
                                String signEmail = scanner.nextLine();

                                boolean door5 = true;
                                while (door5) {
                                    System.out.print("choose the district: \n");
                                    for (District district : districtList) {
                                        System.out.println(district.getId() + ". " + district.getName());
                                    }
                                    int districtId = scanner.nextInt();
                                    District district = null;
                                    for (District district1 : districtList) {
                                        if (district1.getId() == districtId) {
                                            district = district1;
                                            break;
                                        }
                                    }
                                    if (district == null) {
                                        System.out.println("incorrect choice!");
                                    } else {
                                        int lastId = userList.get(userList.size() - 1).getId();
                                        onlineUser = new User(lastId + 1, signName, signEmail, signPassword, signPhone, district);
                                        userList.add(onlineUser);
                                        System.out.println("You have successfully registered!\n");
                                        door1 = false;
                                        door2 = false;
                                        door3 = false;
                                        door4 = false;
                                        door5 = false;
                                    }
                                }
                            } else {
                                System.out.println("Phone number entered incorrectly");
                                door4 = false;
                            }
                        }
                    } else {
                        System.out.println("your password is short,a password must contain at least 6!");
                        door3 = false;
                    }
                }
            }
        }
    }

    public static void signIn() {
        scanner = new Scanner(System.in);
        boolean door6 = true;
        while (door6) {
            System.out.print("login: ");
            String log = scanner.nextLine();
            for (User user : userList) {
                if (user.checkName(log)) {
                    boolean door7 = true;
                    while (door7) {
                        System.out.print("password: ");
                        String password1 = scanner.nextLine();
                        if (user.checkPassword(password1)) {
                            System.out.println("\nWelcome to system " + user.getName());
                            index2++;
                            boolean likeTrue = true;
                            while (likeTrue) {
                                if (CountUnreadMessages(user) > 0) {
                                    System.out.println("Unread message " + CountUnreadMessages(user) + "\n");
                                } else if (getCountAnnouncement(user) > 0) {
                                    System.out.println("New announcement " + getCountAnnouncement(user));
                                }
                                System.out.println("\nChoose the operation:");
                                showOperation();
                                chooseOperation(user);
                                if (index2 == 0) {
                                    door6 = false;
                                    door7 = false;
                                    likeTrue = false;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static int getCountAnnouncement(User user) {
        int count=0;
        for (Announcement countAnnounce : announcementList) {
            if(countAnnounce!=null&&countAnnounce.getUser()!=user){
                count++;
            }
        }
                 return count;
    }

    public static int CountUnreadMessages(User user) {
        int count = 0;
        if (isEmptyMessage()) {
            return count;
        } else {
            for (Message message1 : messageList) {
                if (user.getName().equals(message1.getAnnouncement().getUser().getName())
                    && message1.isStatus())
                    count++;
            }
        }
        return count;
    }

    private static int countAllAnnouncement() {
        int count = 0;
        for (Announcement checking : announcementList) {
            if (checking != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean isEmptyMessage() {
        int count = 0;
        for (Message message1 : messageList) {
            if (message1 == null) {
                count++;
            }
        }
        return count == messageList.size();
    }

    public static void showOperation() {
        System.out.println("1.Add announcement");
        System.out.println("2.View announcements");
        System.out.println("3.My announcements");
        System.out.println("4.Write message");
        System.out.println("5.Inbox");
        System.out.println("6.Log out");
    }

    public static void chooseOperation(User user) {
        int chooseOperation = scanner.nextInt();
        switch (chooseOperation) {
            case 1:
                addAnnouncement(user);
                break;
            case 2:
                showAllAnnouncements(user);
                break;
            case 3:
                myAnnouncement(user);
                break;
            case 4:
                sendMessage(user);
                break;
            case 5:
                viewInbox(user);
                break;
            case 6:
                index2 = 0;
                break;
        }
    }

    public static void addAnnouncement(User user) {
        boolean addAnn = true;
        while (addAnn) {
            scanner = new Scanner(System.in);
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.println("\nChoose the Category:");
            System.out.println("------------------------------");
            for (Category category : categoryList) {
                System.out.println(category.getId() + "." + category.getName());
            }
            System.out.println("------------------------------");
            int chooseCategory = scanner.nextInt();
            for (Category category : categoryList) {
                if (category.getId() == chooseCategory) {
                    System.out.println(category.getName() + "'s subcategories:");
                    break;
                }
            }
            System.out.println("------------------------------");
            for (SubCategory sub : subCategoryList) {
                if (sub.getCategory().getId() == chooseCategory) {
                    System.out.println(sub.getId() + ". " + sub.getName());
                }
            }
            System.out.println("------------------------------");
            int ch = scanner.nextInt();
            for (SubCategory sub : subCategoryList) {
                if (sub.getId() == ch && sub.getCategory().checkCategory(chooseCategory))
                    System.out.println(sub.getCategory().getName() + " > " + sub.getName());
            }
            scanner = new Scanner(System.in);
            System.out.println("Body:");
            String body = scanner.nextLine();
            System.out.println("Cost:");
            int costBrand = scanner.nextInt();
            announcementList.add(new Announcement(announcementId++, title, body, costBrand, user, subCategoryList.get(ch - 1)));
            countAnnounce++;
            System.out.println("Announcement saved!\n");
            addAnn = false;
        }
    }

    public static void showAllAnnouncements(User user) {
        if (!announcementList.isEmpty()) {
            int count = 1;
            System.out.println("========== All announcements (" + countAllAnnouncement() + ") ==========");
            System.out.println("----------------------------------------------");
            for (Announcement per : announcementList) {
                System.out.println(count++ + ". " + per.toString());
                System.out.println("----------------------------------------------");
            }
        } else {
            System.out.println("announcement is empty!");
        }
    }

    public static void myAnnouncement(User user) {
        boolean hasMyAnnouncement = false;
        int count = 1;
        System.out.println("----------------------------------------------");
        for (Announcement person : announcementList) {
            if (user.getName().equals(person.getUser().getName())) {
                System.out.println(count + ". " + person.toString());
                count++;
                hasMyAnnouncement = true;
            }
        }
        if (!hasMyAnnouncement)
            System.out.println("your announcement is empty!");
        System.out.println("----------------------------------------------");
    }

    public static void sendMessage(User sender) {
        int count = 1;
        System.out.println("choose the user:");
        for (User user : userList) {
            System.out.print(count++ + ". " + user.getName()+" |");
        }
        scanner = new Scanner(System.in);
        boolean hasMessage = true;
        while (hasMessage) {
            System.out.print("\nTo: ");
            String to = scanner.nextLine();
            User receiver = isUserHas(to);
            if (receiver != null) {
                Announcement receiver_announcement = null;
                for (Announcement getAnnounce : announcementList) {
                    if (getAnnounce.getUser().equals(receiver)) {
                        receiver_announcement = getAnnounce;
                        break;
                    }
                }
                System.out.print("title: ");
                String title1 = scanner.nextLine();
                System.out.println("body: ");
                String body1 = scanner.nextLine();
                messageList.add(new Message(messageId++, title1, body1, sender,
                        receiver_announcement, true));
                hasMessage = false;
            } else {
                System.out.println("Person not found!");
            }
        }
    }

    public static User isUserHas(String to) {
        for (User user : userList) {
            if (user.getName().equals(to)) {
                return user;
            }
        }
        return null;
    }

    public static void viewInbox(User user) {
        System.out.println("========== messages (" + getAllMessages(user, "receiver") + ") ==========");
        boolean has_message = false;
        for (Message inbox : messageList) {
                if (inbox.getAnnouncement().getUser().equals(user)) {
                    System.out.println("--------------------------------------------");
                    System.out.println(inbox.toString());
                    System.out.println("--------------------------------------------");
                    inbox.setStatus(false);
                    has_message = true;
                }
        }
        if (!has_message)
            System.out.println("Your inbox is empty!");
    }

    public static int getAllMessages(User users, String sender) {
        int count = 0;
        if (!isEmptyMessage()) {
            for (Message countMessage : messageList) {
                if (sender.equals("receiver")) {
                    if (countMessage != null && countMessage.getAnnouncement().getUser().equals(users)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void subCategoryInfo() {
        subCategoryList.add(new SubCategory(1, "Gaz", categoryList.get(0)));
        subCategoryList.add(new SubCategory(2, "Telefon", categoryList.get(0)));
        subCategoryList.add(new SubCategory(3, "Kvartira", categoryList.get(1)));
        subCategoryList.add(new SubCategory(4, "Garaj", categoryList.get(1)));
        subCategoryList.add(new SubCategory(5, "Yuk mashina", categoryList.get(3)));
        subCategoryList.add(new SubCategory(6, "Yengil avtomobil", categoryList.get(3)));
        subCategoryList.add(new SubCategory(7, "O'yinchoqlar", categoryList.get(2)));
        subCategoryList.add(new SubCategory(8, "Kiyimlar", categoryList.get(2)));
    }

    public static void CategoryInfo() {
        categoryList.add(new Category(1, "Electrical equipment", "Texnika buyumlari"));
        categoryList.add(new Category(2, "House and garden", "Xo'jalik va bog'-rog' buyumlari"));
        categoryList.add(new Category(3, "Children's world", "Bolalar kiyimlari,o'yinchoqlar,va hkz"));
        categoryList.add(new Category(4, "Transport", "Transportlar,ularning ehtiyot qsimlari va kkz "));
    }

    public static void DistrictInfo() {
        districtList.add(new District(1, "Chilonzor", regionList.get(0)));
        districtList.add(new District(2, "Bo'stonliq", regionList.get(1)));
        districtList.add(new District(3, "Zomin", regionList.get(2)));
        districtList.add(new District(4, "Guliston", regionList.get(3)));
        districtList.add(new District(5, "Asaka", regionList.get(4)));
        districtList.add(new District(5, "G'ijduvon", regionList.get(5)));
    }

    public static void UserInfo() {
        userList.add(new User(1, "Shoxrux", "shoxrux@gmail.com",
                "asd123", "998049358", districtList.get(0)));
        userList.add(new User(1, "Ahmad", "Ahmad@gmail.com",
                "asd123", "998049344", districtList.get(1)));
        userList.add(new User(1, "Elyor", "Elyor@gmail.com",
                "asd123", "998047358", districtList.get(3)));
    }

    public static void RegionInfo() {
        regionList.add(new Region(1, "Toshkent Shahar"));
        regionList.add(new Region(2, "Toshkent viloyati"));
        regionList.add(new Region(3, "Jizzax"));
        regionList.add(new Region(4, "Sirdaryo"));
        regionList.add(new Region(5, "Andijon"));
        regionList.add(new Region(6, "Buxoro"));
    }
}
