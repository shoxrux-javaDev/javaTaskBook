package PDP.groupPractice.ExtraTask.Ticket;

import java.util.Scanner;

public class Main {
    public static Ticket[] ticket = new Ticket[11];
    public static ScheduleTrain[] schedule = new ScheduleTrain[11];
    public static User[] user = new User[5];
    public static Order[] orders = new Order[100];
    public static Scanner scanner = new Scanner(System.in);
    private static int index = 0;

    public static void main(String[] args) {
        buyTicket();
        showSchedule();
        infoUser();
        enterToSystem();
    }

    private static void enterToSystem() {
        while (true) {
            boolean bool1 = true;
            while (bool1) {
                System.out.print("login: ");
                String log = scanner.nextLine();
                for (User item1 : user) {
                    if (item1.checkLogin(log)) {
                        boolean bool2 = true;
                        while (bool2) {
                            System.out.print("password: ");
                            String pass = scanner.nextLine();
                            if (item1.checkPassword(pass)) {
                                boolean bool3 = true;
                                while (bool3) {
                                    System.out.println("\n" + item1.getName() + " " + item1.getSurName() + "," +
                                            "Welcome to E-ticket Railway system!");
                                    chooseOperation(schedule, ticket,item1, orders);
                                    bool1 = false;
                                    bool2 = false;
                                    bool3 = false;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void chooseOperation(ScheduleTrain[] schedule, Ticket[] ticket, User item1, Order[] orders) {
        boolean bool4 = true;
        while (bool4) {
            listOfOperation();
            scanner = new Scanner(System.in);
            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    clarifyToStation();
                    break;
                case "2":
                    buyToTicket(item1);
                    break;
                case "3":
                    viewOrder(orders, item1);
                    break;
                case "4":
                    System.out.println(item1.toString());
                    break;
                case "5":
                    passwordChangeProcess(item1);
                    break;
                case "6":
                    bool4 = false;
                    break;
            }
        }
    }

    public static void buyTicket() {
        ticket[0] = new Ticket(1, "ТАШКЕНТ ЮЖ", "КУНГРАД",
                "plastkart", 110490, new Train("054Ф", 100));
        ticket[1] = new Ticket(2, "ТАШКЕНТ Ц", "БУХАРА 1",
                "kupe", 143640, new Train("010Ф", 100));
        ticket[2] = new Ticket(3, "ТАШКЕНТ ЮЖ", "ХИВА",
                "plastkart", 153180, new Train("056Ч", 100));
        ticket[3] = new Ticket(4, "ХИВА", "ТАШКЕНТ ЮЖ",
                "kupe", 218240, new Train("056Ж", 100));
        ticket[4] = new Ticket(5, "ШАВАТ", "ТАШКЕНТ ЮЖ",
                "kupe", 117750, new Train("058Ь", 100));
        ticket[5] = new Ticket(6, "НУКУС", "АНДИЖАН 1",
                "lyuks", 282240, new Train("080Ь", 100));
        ticket[6] = new Ticket(7, "ТЕРМЕЗ", "ТАШКЕНТ ЮЖ",
                "plastkart", 88920, new Train("080Ь", 100));
        ticket[7] = new Ticket(8, "БУХАРА 1", "ТАШКЕНТ Ц",
                "plastkart", 74590, new Train("058Ь", 100));
        ticket[8] = new Ticket(9, "ТАШКЕНТ ЮЖ", "АЛАТ",
                "kupe", 152320, new Train("072Ф", 100));
        ticket[9] = new Ticket(10, "КАРШИ", "ТАШКЕНТ Ц",
                "plastkart", 138500, new Train("003Ф", 100));
        ticket[10] = new Ticket(1, "КУНГРАД", "ТАШКЕНТ ЮЖ",
                "plastkart", 80240, new Train("054Щ", 100));
    }

    public static void showSchedule() {
        schedule[0] = new ScheduleTrain(ticket[0].getTrain(), "ТАШКЕНТ ЮЖ", "КУНГРАД", 100);
        schedule[1] = new ScheduleTrain(ticket[1].getTrain(), "ТАШКЕНТ Ц", "БУХАРА 1", 100);
        schedule[2] = new ScheduleTrain(ticket[2].getTrain(), "ТАШКЕНТ ЮЖ", "ХИВА", 100);
        schedule[3] = new ScheduleTrain(ticket[3].getTrain(), "ХИВА", "ТАШКЕНТ ЮЖ", 100);
        schedule[4] = new ScheduleTrain(ticket[4].getTrain(), "ШАВАТ", "ТАШКЕНТ ЮЖ", 100);
        schedule[5] = new ScheduleTrain(ticket[5].getTrain(), "НУКУС", "АНДИЖАН 1", 100);
        schedule[6] = new ScheduleTrain(ticket[6].getTrain(), "ТЕРМЕЗ", "ТАШКЕНТ ЮЖ", 100);
        schedule[7] = new ScheduleTrain(ticket[7].getTrain(), "БУХАРА 1", "ТАШКЕНТ Ц", 100);
        schedule[8] = new ScheduleTrain(ticket[8].getTrain(), "ТАШКЕНТ ЮЖ", "АЛАТ", 100);
        schedule[9] = new ScheduleTrain(ticket[9].getTrain(), "КАРШИ", "ТАШКЕНТ ЮЖ", 100);
        schedule[10] = new ScheduleTrain(ticket[10].getTrain(), "КУНГРАД", "ТАШКЕНТ ЮЖ", 100);
    }

    public static void infoUser() {
        user[0] = new User("Ahmad", "Ro'zmetov", "Ahmad@gmail.com", "asd123", "Ahmad", 1);
        user[1] = new User("Sanjar", "Abdullayev", "Sanjar@gmail.com", "asd123", "Sanjar", 2);
        user[2] = new User("Bobur", "Qurbonov", "Bobur@gmail.com", "asd123", "Bobosh", 3);
        user[3] = new User("Kamola", "Sotvoldiyeva", "Kamola@gmail.com", "asd123", "Komosh", 4);
        user[4] = new User("Ilxom", "Teshaboyev", "Ilhom@gmail.com", "asd123", "Tesha", 5);
    }

    public static void listOfOperation() {
        System.out.println("\nChoose the operation:");
        System.out.println("1.Train Schedule");
        System.out.println("2.Buy ticket");
        System.out.println("3.My orders");
        System.out.println("4.Personal data");
        System.out.println("5.Change password");
        System.out.println("6.Log out");
    }

    public static void clarifyToStation() {
        System.out.print("Chose the Station: ");
        String numStation = scanner.nextLine();
        boolean bool5 = true;
        while (bool5) {
            System.out.println("1-Arrival  2-Departure  3- Exit");
            String numSchedule = scanner.nextLine();
            System.out.println("---------------------");
            if (numSchedule.equals("1")) {
                System.out.println("Arrival: ");
                for (ScheduleTrain ignored : schedule) {
                    if (ignored.isArr(numStation)) {
                        System.out.println(ignored.toString());
                    }
                }
                System.out.println("---------------------");
            } else if (numSchedule.equals("2")) {
                System.out.println("Departure: ");
                for (ScheduleTrain ignored : schedule) {
                    if (ignored.isDes(numStation)) {
                        System.out.println(ignored.toString());
                    }
                }
                System.out.println("---------------------");
            } else {
                bool5 = false;
            }
        }
    }

    public static void buyToTicket(User currentUser) {
        boolean bool6 = true;
        while (bool6) {
            System.out.print("From: ");
            String nameDep = scanner.nextLine();
            System.out.println("---------------------------");
            for (Ticket ticket1 : ticket) {
                if (ticket1.checkDep(nameDep)) {
                    System.out.println(ticket1.toString());
                }
            }
            System.out.println("---------------------------");
            System.out.print("\nTo: ");
            String nameDes = scanner.nextLine();
            System.out.println("---------------------------");
            for (Ticket ticket1 : ticket) {
                if (ticket1.checkDest(nameDes) && ticket1.checkDep(nameDep)) {
                    System.out.println(ticket1.toString());
                    ticket1.setStatus(false);
                    boolean bool7 = true;
                    while (bool7) {
                        System.out.println("Do you buy this ticket? 1-Yes  2-No");
                        String chooseAnswer = scanner.nextLine();
                        if (chooseAnswer.equals("1")) {
                            ScheduleTrain.countOfTicket -= 1;
                            orders[index++] = new Order(index, currentUser, ticket1);
                            System.out.println("This ticket was purchased!");
                            System.out.println("---------------------------");
                            bool6 = false;
                            bool7 = false;
                        } else if (chooseAnswer.equals("2")) {
                            bool6 = false;
                            bool7 = false;
                        } else {
                            System.out.println("Enter the correct number!\n");
                        }
                    }
                }
            }
        }
    }

    private static void viewOrder(Order[] orders, User item1) {
        boolean isVisible = false;
        System.out.println("========== Orders (" + getAllOrders(orders, item1) + ") ==========");
        for (Order order : orders) {
            if (order != null) {
                if (order.getUser().getEmail().equals(item1.getEmail())) {
                    System.out.println("----------------------------------------------");
                    System.out.println(order.toString());
                    System.out.println("----------------------------------------------");
                    isVisible = true;
                }
            }
        }
        if (!isVisible)
            System.out.println("Your inbox is empty!");
    }

    private static int getAllOrders(Order[] orders, User item1) {
        int count = 0;
        if (!isEmptyOrder(orders)) {
            for (Order order : orders) {
                if (order != null && order.getUser().getEmail().equals(item1.getEmail()))
                    count++;
            }
        }
        return count;
    }

    public static boolean isEmptyOrder(Order[] orders) {
        int count = 0;
        for (Order order : orders) {
            if (order == null)
                count++;
        }
        return count == orders.length;
    }

    private static void passwordChangeProcess(User item1) {
        boolean changePassword = true;
        while (changePassword) {
            System.out.print("\nCurrent password: ");
            String current = scanner.nextLine();
            if (item1.checkPassword(current)) {
                System.out.print("New password(at least 4 digits): ");
                String newPassword = scanner.nextLine();
                if (ValidatePassword(newPassword)) {
                    System.out.print("Confirm password: ");
                    String confirm = scanner.nextLine();
                    if (newPassword.equals(confirm)) {
                        item1.setPassword(newPassword);
                        System.out.println("The password was changed successfully\n");
                        changePassword = false;

                    } else {
                        System.out.println("The password you entered did not match");
                    }
                } else {
                    System.out.println("A password must contain at least 4 digits,one uppercase letter" +
                            " one lowercase letter,one numeric value no spaces.");
                }

            } else {
                System.out.println("The current password is incorrect!");
            }
        }
    }

    public static boolean ValidatePassword(String newPassword) {
        if (newPassword.length() < 4 || newPassword.contains(" ")) return false;
        int countDigit = 0, countUppercase = 0, countLowercase = 0;
        for (char checking : newPassword.toCharArray()) {
            if (Character.isDigit(checking)) countDigit++;
            if (Character.isUpperCase(checking)) countUppercase++;
            if (Character.isLowerCase(checking)) countLowercase++;
        }
        return countDigit != 0 && countUppercase != 0 && countLowercase != 0;
    }

}
