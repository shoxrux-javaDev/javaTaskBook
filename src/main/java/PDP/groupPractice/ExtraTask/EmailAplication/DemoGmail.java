package PDP.groupPractice.ExtraTask.EmailAplication;
import java.util.Scanner;

public class DemoGmail {
    public static Scanner scanner = new Scanner(System.in);
    public static Gmail[] gmails = new Gmail[6];
    public static boolean firstWhile = true;
    public static boolean secondWhile = true;
    public static boolean thirdWhile = true;

    public static void main(String[] args) {
        while (true) {
            infoUser();
            System.out.println("Main Menu:");
            System.out.println("1. Gmail\n2. List fo Gmails\n3. Exit");
            chooseMenu();
        }
    }

    public static void infoUser() {
        gmails[0] = new Gmail("Shaxboz@gmail.com", "Shaxboz", "Toirov", "lkj123");
        gmails[1] = new Gmail("Elbek@gmail.com", "Elbek", "G'ofurov", "lkj123");
        gmails[2] = new Gmail("Umid@gmail.com", "Umid", "Iskandarov", "lkj123");
        gmails[3] = new Gmail("Solijon@gmail.com", "Solijon", "Xushboqov", "lkj123");
        gmails[4] = new Gmail("Lochin@gmail.com", "Lochin", "Xojiyev", "lkj123");
        gmails[5] = new Gmail("Shoxrux@gmail.com", "Shoxrux", "Sindarov", "lkj123");
    }

    public static void chooseMenu() {
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                enterToGmail();
                break;
            case 2:
                listOfGmail();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    public static void enterToGmail() {
        listOfGmail();
        firstWhile = true;
        while (firstWhile) {
            scanner = new Scanner(System.in);
            System.out.print("Please,enter gmail address: ");
            String gmail = scanner.nextLine();
            for (Gmail firstGmail : gmails) {
                if (firstGmail.checkGmail(gmail)) {
                    secondWhile = true;
                    while (secondWhile) {
                        scanner = new Scanner(System.in);
                        System.out.print("password: ");
                        String passwords = scanner.nextLine();
                        if (firstGmail.CheckPassword(passwords)) {
                            thirdWhile = true;
                            while (thirdWhile) {
                                System.out.println("\n" + firstGmail.toString());
                                if (firstGmail.getIntUnreadMessage() > 0) {
                                    System.out.println("unread message " + firstGmail.getIntUnreadMessage() + "\n");
                                }
                                chooseOperation(firstGmail);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void listOfGmail() {
        int count = 1;
        System.out.println("List of Gmail");
        System.out.println("--------------------------");
        for (Gmail gmail : gmails) {
            System.out.println(count + "." + gmail.getGmail());
            count++;
        }
        System.out.println("--------------------------");
    }

    public static void chooseOperation(Gmail firstGmail) {
        scanner = new Scanner(System.in);
        listOfOperation();
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                listOfGmail();
                SentGmail(gmails, firstGmail);
                break;
            case 2:
                viewUnreadMessage(firstGmail);
                break;
            case 3:
                viewSentMessage(firstGmail);
                break;
            case 4:
                viewInbox(firstGmail);
                break;
            case 5:
                changePassword(firstGmail);
                break;
            case 6:
                firstWhile = false;
                secondWhile = false;
                thirdWhile = false;
                break;
        }

    }

    public static void listOfOperation() {
        System.out.println("\nchoose the operation:");
        System.out.println("1-Sent email");
        System.out.println("2-View unread");
        System.out.println("3-View sent email");
        System.out.println("4-View inbox");
        System.out.println("5-Change password");
        System.out.println("6-Log out");
    }

    public static void SentGmail(Gmail[] gmails, Gmail sender) {
        boolean fourthWhile = true;
        while (fourthWhile) {
            scanner = new Scanner(System.in);
            System.out.println("New message");
            System.out.print("To: ");
            String nameTo = scanner.nextLine();
            Gmail receiver = getGmail(gmails, nameTo);
            if (receiver != null) {
                System.out.print("Subject: ");
                String subjectTo = scanner.nextLine();
                System.out.println("Message:");
                String messageTo = scanner.nextLine();
                receiver.setInbox(messageTo, subjectTo, sender);
                sender.setOutbox(messageTo, subjectTo, receiver);
                System.out.println("The message sent successfully");
                fourthWhile = false;
            } else {
                System.out.println("the email was not found");
            }
        }
    }

    private static Gmail getGmail(Gmail[] gmails, String nameTo) {
        for (Gmail firstGmail : gmails) {
            if (firstGmail.getGmail().equals(nameTo)) {
                return firstGmail;
            }
        }
        return null;
    }

    private static void viewUnreadMessage(Gmail firstGmail) {
        if (firstGmail.getIntUnreadMessage() != 0) {
            String[] AllMassage = firstGmail.getInbox();
            for (int i = 0; i < AllMassage.length; i++) {
                if (AllMassage[i] != null) {
                    System.out.println("---------------------------------------");
                    System.out.println(firstGmail.getSubjects(i));
                    Gmail sender = firstGmail.getSender(i);
                    System.out.println(sender.toString());
                    System.out.println("Message: " + firstGmail.getMessageByInbox(i));
                    firstGmail.setStatus(i, false);
                    System.out.println("---------------------------------------");
                }
            }

        } else {
            System.out.println("you don't have unread message!");
        }
    }

    private static void viewSentMessage(Gmail firstGmail) {
        if (!firstGmail.isEmptyBox(firstGmail.getOutbox())) {
            String[] AllMessage = firstGmail.getOutbox();
            for (int i = 0; i < AllMessage.length; i++) {
                if (AllMessage[i] != null) {
                    System.out.println("------------------------------------------");
                    System.out.println(firstGmail.getSubjects(i));
                    Gmail receiver = firstGmail.getReceiver(i);
                    System.out.println(receiver.toString());
                    System.out.println("------------------------------------------");
                }
            }
        } else {
            System.out.println("sentbox is empty!");
        }
    }

    private static void viewInbox(Gmail firstGmail) {
        if (firstGmail.isEmptyBox(firstGmail.getInbox())) {
            for (int i = 0; i < 10; i++) {
                if (firstGmail.getInbox()[i] != null) {
                    System.out.println("---------------------------------------");
                    System.out.println(firstGmail.getSender(i));
                    System.out.println(firstGmail.getSubjects(i));
                    System.out.println("Message :" + firstGmail.getInbox()[i]);
                    if (firstGmail.getStatus()[i]) {
                        System.out.println("Message unread");
                    } else {
                        System.out.println("Message read");
                    }
                    System.out.println("---------------------------------------");
                }
            }
        } else {
            System.out.println("inbox is emty!");
        }
    }

    private static void changePassword(Gmail firstGmail) {
        boolean fifthWhile = true;
        while (fifthWhile) {
            System.out.print("\nCurrent password:");
            String currentPassword = scanner.nextLine();
            if (firstGmail.isChangePassword(currentPassword)) {
                System.out.println("New password (at least 4 digits): ");
                String newPassword = scanner.nextLine();
                if (validatePassword(newPassword)) {
                    System.out.println("Confirm password: ");
                    String confirmPassword = scanner.nextLine();
                    if (newPassword.equals(confirmPassword)) {
                        firstGmail.setPassword(newPassword);
                        System.out.println("The password was changed successfully!\n");
                        fifthWhile = false;
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

    public static boolean validatePassword(String newPassword) {
        if (newPassword.length() < 4 || newPassword.contains(" ")) return false;
        int countDigit = 0;
        int countUppercase = 0;
        int countLowercase = 0;
        for (char chars : newPassword.toCharArray()) {
            if (Character.isDigit(chars))
                countDigit++;
            if (Character.isUpperCase(chars))
                countUppercase++;
            if (Character.isLowerCase(chars))
                countLowercase++;
        }
        return countDigit != 0 && countUppercase != 0 && countLowercase != 0;
    }
}
