package PDP.groupPractice.ExtraTask.EmailAppByLochin;

import java.util.Scanner;

    public class EmailApp {
        public static int i;
        public static int temp;
        public static int count = 0;
        public static int sumOfSentMassages;
        public static int sumOfUnreadMassages;
        public static String currentUserNameOf = "";
        public static Email[] emails = new Email[100];

        public static void main(String[] args) {
            User[] users = new User[5];
            users[0] = new User("Lochinbek", "Xojiyev", "Khojiyev@gmail.com", "asd123");
            users[1] = new User("Bobur", "Kamolov", "kamolov@gmail.com", "asd123");
            users[2] = new User("Sardor", "Murodov", "murodov@gmail.com", "asd123");
            users[3] = new User("Shohruh", "Sindarov", "sindarov@gmail.com", "asd123");
            users[4] = new User("Saidolim", "Karimov", "karimov@gmail.com", "asd123");

            while (true) {
                showMainMenu();
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        signInToGmail(users);
                        break;
                    case 2:
                        listOfEmails(users);
                        break;
                    case 0:
                        System.out.println("--Bye--");
                        return;
                }

            }

        }

        private static void showMainMenu() {
            System.out.println("-Main menu--\n" +
                               "1. Gmail\n" +  // first
                               "2. List of Emails\n" +  // second
                               "0. Exit");
        }

        private static void listOfGmailsForSignIn(User[] users) {
            System.out.println("------------------------------------------------------");
            for (int i = 0; i < 5; i++) {
                System.out.println(users[i].getFirstName() + " || " + users[i].getEmailAddress());
            }
            System.out.println("------------------------------------------------------\n");
        }

        private static void signInToGmail(User[] users) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("--Sign in --");
            listOfGmailsForSignIn(users);
            System.out.print("Gmail: ");
            String currentUserGmail = scanner.nextLine();
            boolean notFoundUserGmail = true;
            for (int i = 0; i < users.length; i++) {
                if (currentUserGmail.equals(users[i].getEmailAddress())) {
                    currentUserNameOf = users[i].getFirstName() + " " + users[i].getLastName();
                    temp = i;
                    notFoundUserGmail = false;
                    boolean notFoundCurrentPasswordOfUser = true;
                    while (notFoundCurrentPasswordOfUser) {
                        System.out.print("Password: ");
                        String currentUserPassword = scanner.nextLine();
                        if (currentUserPassword.equals(users[i].getPassword())) {
                            notFoundCurrentPasswordOfUser = false;
                            operationsOfCurrentUser(users);
                        }
                        if (notFoundCurrentPasswordOfUser) {
                            System.out.println("------------------------------------------------------");
                            System.out.println("Upps!? Incorrect password!(Exit-0)");
                            System.out.println("------------------------------------------------------\n");
                        }
                        if (currentUserPassword.equals("0")) {
                            return;
                        }
                    }
                }
            }
            if (notFoundUserGmail) {
                System.out.println("Such email is not found!\n");
            }
        }

        private static void showMainMenuOfAccouont() {
            System.out.println("Choise the operations");
            System.out.println("------------------------------------------------------");
            System.out.println("1.Send email\n" +
                               "2.View unread emails\n" +
                               "3.View sent emails\n" +
                               "4.View inbox\n" +
                               "5.Change password\n" +
                               "0.Log out");
            System.out.println("------------------------------------------------------");
        }

        private static void operationsOfCurrentUser(User[] users) {
            System.out.println();
            System.out.println("-- Welcome to email account " + currentUserNameOf + "--\n");
            notificationUnreadMassages(users);
            while (true) {
                showMainMenuOfAccouont();
                Scanner scanner = new Scanner(System.in);
                int choiceForOperations = scanner.nextInt();
                switch (choiceForOperations) {
                    case 1:
                        sendMAil(users);
                        break;
                    case 2:
                        showUnreadMassages(users);// errors
                        sumOfUnreadMassages = 0;
                        break;
                    case 3:
                        showSentEmails(users);
                        break;
                    case 4:
                        viewInbox(users);
                        break;
                    case 5:
                        changePassword(users);
                        break;
                    case 0:
                        sumOfUnreadMassages = 0;
                        System.out.println("Exiting...\n");
                        return;
                }
            }
        }

        private static int sumUnreadMassages(User[] users) {
            for (int i = 0; i < count; i++) {
                if (emails[i] != null) {
                    if (emails[i].getReceiver().getEmailAddress().equals(users[temp].getEmailAddress())) {
                        sumOfUnreadMassages++;
                    }
                }
            }
            return sumOfUnreadMassages;
        }

        private static void notificationUnreadMassages(User[] users) {
            for (int j = 0; j < count; j++) {
                if (emails[j].isStatus() && emails[j].getReceiver().getEmailAddress().equals(users[temp].getEmailAddress())) {
                    System.out.println("==You have " + sumUnreadMassages(users) + " new Massages!==\n");
                }
            }


        }

        private static void sendMAil(User[] users) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("--Send email-- ");
            listOfGmailsForSignIn(users);
            User emailReceiver = EmailReceiver(users);
            System.out.print("Subject: ");
            String sendingSubjectOfMassage = scanner.nextLine();
            System.out.print("Massage: ");
            String sendingMessege = scanner.nextLine();

            User emailSender = new User(users[temp].getFirstName(), users[temp].getLastName(), users[temp].getEmailAddress(), users[temp].getPassword());
            emails[count++] = new Email(sendingSubjectOfMassage, sendingMessege, emailSender, emailReceiver, true);
            System.out.println("Mail was sent succesfully! \n");

        }

        private static void showUnreadMassages(User[] users) {
            System.out.println("       --Veiw unread mails--");
            boolean noUnreadMassages = true;
            System.out.println("------------------------------------------------------");
            for (int i = 0; i < count; i++) {
                if (emails[i] != null) {
                    if (emails[i].isStatus()) {
                        if (emails[i].getReceiver().getEmailAddress().equals(users[temp].getEmailAddress())) {
                            noUnreadMassages = false;
                            System.out.println("Subject: " + emails[i].getSubject() + " || " +
                                               "Massage: " + emails[i].getMassage() + " || " +
                                               "Sender: " + emails[i].getSender().getEmailAddress() + " || " +
                                               checkStatus());
                            emails[i].setStatus(false);
                        }
                    }
                }
            }
            if (noUnreadMassages) {
                System.out.println("No unread Massages!");
            }
            System.out.println("------------------------------------------------------\n");

        }

        private static String checkStatus() {
            if (emails[i].isStatus()) {
                return "unread!";
            } else return "read!";
        }

        private static void showSentEmails(User[] users) {
            System.out.println("==Sent Massages==");
            System.out.println("You have "+sumSentMassages(users)+" massages in box");
            System.out.println("------------------------------------------------------");
            boolean noSentMassages = true;
            for (int i = 0; i < count; i++) {
                if (users[i] != null) {
                    if (emails[i].getSender().getEmailAddress().equals(users[temp].getEmailAddress())) {
                        noSentMassages = false;
                        System.out.println("Subject: " + emails[i].getSubject() + " || " +
                                           "Massage: " + emails[i].getMassage() + " || " +
                                           "Receiver: " + emails[i].getReceiver().getEmailAddress());

                    }
                }
            }
            if (noSentMassages) {
                System.out.println("NO massages");
            }
            System.out.println("------------------------------------------------------\n");
        }

        private static int sumSentMassages(User[] users) {
            for (int i = 0; i < count; i++) {
                if (emails[i] != null) {
                    if (emails[i].getSender().getEmailAddress().equals(users[temp].getEmailAddress())) {
                        sumOfSentMassages++;
                    }
                }
            }
            return sumOfSentMassages;

        }

        private static void viewInbox(User[] users) {
            System.out.println("==Inbox==");
            System.out.println("------------------------------------------------------");
            boolean noMassages = true;
            for (int i = 0; i < count; i++) {
                if (emails[i] != null) {
                    if (emails[i].getReceiver().getEmailAddress().equals(users[temp].getEmailAddress())) {
                        noMassages = false;
                        System.out.println("Subject: " + emails[i].getSubject() + " || " +
                                           "Massage: " + emails[i].getMassage() + " || " +
                                           "Sender: " + emails[i].getSender().getEmailAddress() + " || " +
                                           checkStatus());
                        emails[i].setStatus(false);
                    }
                }
            }
            if (noMassages) {
                System.out.println("You have no massages!");
            }
            System.out.println("------------------------------------------------------\n");
        }

        private static void changePassword(User[] users) {
            System.out.println("\n--Change password--\n");
            System.out.print("Old Password: ");
            Scanner scanner = new Scanner(System.in);
            String oldPassword = scanner.nextLine();
            if (oldPassword.equals(users[temp].getPassword())) {
                System.out.print("New Password: ");
                String newPassword = scanner.nextLine();
                System.out.print("Confirm new Password: ");
                String newPasswordConform = scanner.nextLine();
                if (newPassword.equals(newPasswordConform)) {
                    users[temp].setPassword(newPassword);
                    System.out.println("\n--Password was changed succesfully!!!--\n");
                } else {
                    System.out.println("Confirmation password is wrong!!");
                }
            } else {
                System.out.println("\nPassword is not true!?\n");
            }
        }

  //  System.out.println();

        private static User EmailReceiver(User[] users) {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("To: ");
                String receiverEmailUser = scanner.nextLine();
                for (User tempUser : users) {
                    if (tempUser.getEmailAddress().equals(receiverEmailUser)) {
                        return new User(tempUser.getFirstName(), tempUser.getLastName(), tempUser.getEmailAddress(), tempUser.getPassword());
                    }
                }
                System.out.println("\nUpps!? Such email is not found!\n");
            }
        }

        private static void listOfEmails(User[] users) {
            System.out.println("List of Emails");
            for (int i = 0; i < 5; i++) {
                System.out.println(users[i].toString());
            }
            System.out.println();
        }


    }


