package PDP.groupPractice.ExtraTask.Invoice;

/*Invoice.
    Quyidagi attributelardan iborat Invoice klassini encapsulation prinsipi asosida yarating:
    (string) invoiceNumber, (int) cost, (boolean) status, (String) paidBy.   Bunda "invoiceNumber" invoice nomeri,
    "cost"qancha to'lash kerakligi, "status" to'lov xolati, "paidBy" kim to'lagani. */

import java.util.Scanner;

public class Main {
    public static Invoice[] invoice = new Invoice[5];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        invoice[0] = new Invoice("123-001", 850);
        invoice[1] = new Invoice("123-003", 350);
        invoice[2] = new Invoice("123-023", 300);
        invoice[3] = new Invoice("123-013", 400);
        invoice[4] = new Invoice("123-009", 1000);
        scanner = new Scanner(System.in);
        System.out.println("ism va familiyangizni kiritng : ");
        String paidBy = scanner.nextLine();
        while (true) {
            scanner = new Scanner(System.in);
            System.out.println("to'lov qilmoqchi bo'lgan invioce raqamini kiriting:(chiqish-> 0) ");
            String numberInvoice = scanner.nextLine();
            if (numberInvoice.equals("0")) {
                return;
            } else {
                checkInvoice(numberInvoice, paidBy);
            }
        }
    }


    private static void checkInvoice(String numberInvoice, String paidBy) {
        switch (numberInvoice) {
            case "123-001":
                putOnInform(invoice[0],paidBy);
                break;
            case "123-003":
                putOnInform(invoice[1],paidBy);
                break;
            case "123-023":
                putOnInform(invoice[2],paidBy);

                break;
            case "123-013":
                putOnInform(invoice[3],paidBy);
                break;
            case "123-009":
                putOnInform(invoice[4],paidBy);
                break;
            default:
                System.out.println("bunday invoice raqami bazada mavjud emas");
                break;
        }
    }

    public static void putOnInform(Invoice invoice, String paidBy) {
        System.out.println(invoice.toString());
        System.out.println("qacha to'lov qilmoqchisiz?: ");
        int cost = scanner.nextInt();
        invoice.setCost(cost);
        invoice.setPaidBy(paidBy);
        System.out.println(invoice.toString());
    }

}
