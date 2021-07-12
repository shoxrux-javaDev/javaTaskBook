package PDP.groupPractice.ExtraTask.OptimalEmailAplication;

import java.util.Scanner;

public class EmailApplication {
    static Scanner scanner = new Scanner(System.in);
    static int index = 0;
    static int size = 100;

    public static void main(String[] args) {
        Email[] emails = new Email[size];

        User[] users = new User[5];
        users[0] = new User("gm.khamza@gmail.com", "Khamza", "Kuranbayev", "asd123");
        users[1] = new User("sardor@gmail.com", "Sardor", "Raximov", "asd123");
        users[2] = new User("otabek@gmail.com", "Otabek", "G'ofurov", "asd123");
        users[3] = new User("sanat@gmail.com", "Sanat", "Bekchanov", "asd123");
        users[4] = new User("araxim@gmail.com", "Abduraxim", "Jumayev", "asd123");

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Gmail");
            System.out.println("2. List of emails");
            System.out.println("0. Exit");
            int main_choice = scanner.nextInt();

            if (main_choice == 1) {
                viewEmailList(users);

                boolean bool = true;
                while (bool) {
                    System.out.print("Please, enter email address: ");
                    String email = scanner.next();

                    for (User user : users) {
                        if (user.checkEmail(email)) {
                            boolean bool1 = true;
                            while (bool1) {
                                System.out.print("Password: ");
                                String password = scanner.next();

                                if (user.checkPassword(password)) {
                                    boolean b = true;
                                    while (b) {
                                        System.out.println("\n" + user.toString());
                                        if (getCountUnreadMessages(emails, user) > 0) {
                                            System.out.println("Unread messages: " + getCountUnreadMessages(emails, user));
                                        }
                                        System.out.println();
                                        printOperations();

                                        int choice = scanner.nextInt();
                                        switch (choice) {
                                            case 1:
                                                viewEmailList(users);
                                                sentEmail(emails, users, user);
                                                break;
                                            case 2:
                                                viewUnread(emails, user);
                                                break;
                                            case 3:
                                                viewSentEmails(emails, user);
                                                break;
                                            case 4:
                                                viewInbox(emails, user);
                                                break;
                                            case 5:
                                                changePassword(user);
                                                break;
                                            case 6:
                                                b = false;
                                                break;
                                        }
                                    }
                                    bool1 = false;
                                } else {
                                    System.out.print("The password is incorrect!\n");
                                }
                                bool = false;
                            }
                        }
                    }
                }

            } else if (main_choice == 2) {
                viewUsersList(users);
                System.out.println();
            }
            if (main_choice == 0) {
                System.exit(0);
            }
        }

    }

    private static void viewInbox(Email[] emails, User user) {
        boolean hasUnread = false;
        System.out.println("========== Inbox (" + getAllMessages(emails, user, "receiver") + ") ==========");
        for (Email email : emails) {
            if (email != null) {
                if (email.getReceiver().getEmail().equals(user.getEmail())) {
                    System.out.println("----------------------------------------------");
                    System.out.println(email.toString());
                    System.out.println("----------------------------------------------");
                    email.setStatus(false);
                    hasUnread = true;
                }
            }
        }
        if (!hasUnread)
            System.out.println("Your inbox is empty!");
    }

    private static void viewSentEmails(Email[] emails, User user) {
        boolean hasSentEmails = false;
        System.out.println("========== Sent emails (" + getAllMessages(emails, user, "sender") + ") ==========");
        for (Email email : emails) {
            if (email != null) {
                if (email.getSender().getEmail().equals(user.getEmail())) {
                    System.out.println("----------------------------------------------");
                    System.out.println("Subject: " + email.getSubject() +
                                       " | " + "Message: " + email.getMessage() + " | " + "Receiver: " + email.getReceiver());
                    System.out.print("----------------------------------------------");
                    hasSentEmails = true;
                }
            }
        }
        if (!hasSentEmails)
            System.out.println("You don't have sent email(s)!");
    }

    private static void viewUnread(Email[] emails, User user) {
        boolean hasUnread = false;
        System.out.println("========== Unread messages (" + getCountUnreadMessages(emails, user) + ") ==========");
        for (Email email : emails) {
            if (email != null && email.isStatus()) {
                if (email.getReceiver().getEmail().equals(user.getEmail())) {
                    System.out.println("----------------------------------------------");
                    System.out.println(email.toString());
                    System.out.println("----------------------------------------------");
                    email.setStatus(false);
                    hasUnread = true;
                }
            }
        }
        if (!hasUnread)
            System.out.println("You don't have unread message(s)!");
    }

    public static void sentEmail(Email[] emails, User[] users, User sender) {
        boolean b = true;
        while (b) {
            System.out.println("New Message");
            System.out.print("To: ");
            String toEmail = scanner.next();

            User receiver = getUserFromEmail(toEmail, users);
            if (receiver != null) {
                scanner = new Scanner(System.in);
                System.out.print("Subject: ");
                String subject = scanner.nextLine();
                System.out.println("Message: ");
                String message = scanner.nextLine();

                if (isEmailFull(emails)) {
                    emails[index++] = new Email(subject, message, sender, receiver, true);
                    if (index == size)
                        index = 0;
                } else {
                    for (int i = 0; i < emails.length; i++) {
                        if (emails[i] == null) {
                            emails[i] = new Email(subject, message, sender, receiver, true);
                            break;
                        }
                    }
                }

                System.out.println("The message sent successfully!");
                b = false;
            } else {
                System.out.println("Email not found!");
            }
        }
    }

    public static boolean isEmailFull(Email[] emails) {
        int count = 0;
        for (Email email : emails) {
            if (email != null) {
                count++;
            }
        }
        return count == emails.length;
    }

    static User getUserFromEmail(String toEmail, User[] users) {
        for (User user : users) {
            if (user.getEmail().equals(toEmail)) {
                return user;
            }
        }
        return null;
    }

    public static void printOperations() {
        System.out.println("Choose the operation:");
        System.out.println("1-Sent email");
        System.out.println("2-View unread");
        System.out.println("3-View sent emails");
        System.out.println("4-View inbox");
        System.out.println("5-Change Password");
        System.out.println("6-Log Out");
    }

    private static int getCountUnreadMessages(Email[] emails, User user) {
        int count = 0;
        if (isEmptyEmails(emails)) {
            return count;
        } else {
            for (Email email : emails) {
                if (email != null && email.getReceiver().equals(user) && email.isStatus())
                    count++;
            }
        }
        return count;
    }

    private static int getAllMessages(Email[] emails, User user, String user_type) {
        int count = 0;
        if (!isEmptyEmails(emails)) {
            for (Email email : emails) {
                if (user_type.equals("sender")) {
                    if (email != null && email.getSender().equals(user))
                        count++;
                } else {
                    if (email != null && email.getReceiver().equals(user))
                        count++;
                }
            }
        }
        return count;
    }

    public static boolean isEmptyEmails(Email[] emails) {
        int count = 0;
        for (Email email : emails) {
            if (email == null)
                count++;
        }
        return count == emails.length;
    }

    private static void viewEmailList(User[] users) {
        System.out.println("\nList of emails:");
        System.out.println("---------------------------------");
        for (User user : users) {
            System.out.println(user.getEmail());
        }
        System.out.println("---------------------------------");
    }

    public static void viewUsersList(User[] users) {
        System.out.println("\nList of Accounts:");
        System.out.println("---------------------------------");
        for (User user : users)
            System.out.println(user.toString());
        System.out.println("---------------------------------");
    }

    private static void changePassword(User user) {
        boolean bool = true;
        while (bool) {
            System.out.print("\nCurrent password: ");
            String current_password = scanner.next();
            if (user.isChangePassword(current_password)) {
                System.out.print("New password (at least 4 digits): ");
                String new_password = scanner.next();
                if (validatePassword(new_password)) {
                    System.out.print("Confirm password: ");
                    String confirm_password = scanner.next();
                    if (new_password.equals(confirm_password)) {
                        user.setPassword(new_password);
                        System.out.println("The password was changed successfully!\n");
                        bool = false;
                    } else {
                        System.out.print("The passwords you entered did not match");
                    }
                } else {
                    System.out.println("A password must contain at least 4 digits, one Uppercase letter, " +
                            "one lowercase letter, one numeric value, no spaces.");
                }
            } else {
                System.out.println("The current password is incorrect!");
            }
        }
    }

    public static boolean validatePassword(String password) {
        if (password.length() < 4 || password.contains(" ")) return false;

        int countDigit = 0;
        int countUpperCase = 0;
        int countLowerCase = 0;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c))
                countDigit++;
            if (Character.isUpperCase(c))
                countUpperCase++;
            if (Character.isLowerCase(c))
                countLowerCase++;
        }
        return countDigit != 0 && countUpperCase != 0 && countLowerCase != 0;
    }

}
