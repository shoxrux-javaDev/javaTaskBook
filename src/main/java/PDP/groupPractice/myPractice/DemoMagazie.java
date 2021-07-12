package PDP.groupPractice.myPractice;

import java.util.Scanner;

public class DemoMagazie {

    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        String chooseOption;
        System.out.println("online do'konga xush kelibsiz!");
        Magazine[] products = new Magazine[3];
        products[0] = new Magazine();
        products[1] = new Magazine();
        products[2] = new Magazine();

        callMethod(products[0]);
        callMethod(products[1]);
        callMethod(products[2]);
        while (true) {
            System.out.println("Iltimos maxsulotni tanlang: ");
            System.out.print("1. " + products[0].getName());
            System.out.print("  2. " + products[1].getName());
            System.out.print("  3. " + products[2].getName());
            System.out.print("  4. chiqish  ");
            scanner = new Scanner(System.in);
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.print("Optsiyani tanlang 1. sotib olish  2.omborga qo'shish  ");
                    chooseOption = scanner.nextLine();
                    if (chooseOption.equals("1")) {
                        System.out.print("qancha sotib olmoqchisiz? omborda " + products[0].getQty() + " ta mavjud  ");
                        scanner = new Scanner(System.in);
                        num = scanner.nextInt();
                        if (products[0].buying(num)) {
                            System.out.println(" Xaridingiz uchun rahmat!Umumiy summa " + num * products[0].getPrice() +
                                    "so'm siz " + num + " ta " + products[0].getName() + " xarid qildingiz");
                            break;
                        }
                    } else if (chooseOption.equals("2")) {
                        System.out.println("omborga qancha maxsulot qo'shmoqchisiz?" +
                                " omborda " + products[0].getQty() + " ta mavjud  ");
                        num = scanner.nextInt();
                        products[0].setAdd(num);
                        System.out.println("omborga " + num +" ta "+products[0].getName()+" qo'shildi " +
                                "jami: " + products[0].getAdd() + " ta "+products[0].getName()+" bo'ldi");
                        break;
                    }
                case "2":
                    System.out.print("Optsiyani tanlang 1. sotib olish  2.omborga qo'shish  ");
                    scanner = new Scanner(System.in);
                    chooseOption = scanner.nextLine();
                    if (chooseOption.equals("1")) {
                        System.out.print("qancha sotib olmoqchisiz? omborda " + products[1].getQty() + " ta mavjud  ");
                        num = scanner.nextInt();
                        if (products[1].buying(num)) {
                            System.out.println(" Xaridingiz uchun rahmat!Umumiy summa " + num * products[1].getPrice() +
                                    "so'm siz " + num + " ta " + products[1].getName() + " xarid qildingiz");
                            break;
                        }
                    } else if (chooseOption.equals("2")) {
                        System.out.print("omborga qancha maxsulot qo'shmoqchisiz?" +
                                " omborda " + products[1].getQty() + " ta mavjud  ");
                        scanner = new Scanner(System.in);
                        num = scanner.nextInt();
                        products[1].setAdd(num);
                        System.out.println("omborga " + num +" ta "+products[2].getName()+" qo'shildi " +
                                "jami: " + products[2].getAdd() + " ta "+products[2].getName()+" bo'ldi");
                        break;
                    }
                case "3":
                    System.out.print("Optsiyani tanlang 1. sotib olish  2.omborga qo'shish  ");
                    scanner = new Scanner(System.in);
                    chooseOption = scanner.nextLine();
                    if (chooseOption.equals("1")) {
                        System.out.print("qancha sotib olmoqchisiz? omborda " + products[2].getQty() + " ta mavjud  ");
                        scanner = new Scanner(System.in);
                        num = scanner.nextInt();
                        if (products[1].buying(num)) {
                            System.out.println(" Xaridingiz uchun rahmat! Umumiy summa " + num * products[1].getPrice() +
                                    "so'm siz " + num + " ta " + products[1].getName() + " xarid qildingiz");
                            break;
                        }
                    } else if (chooseOption.equals("2")) {
                        System.out.print("omborga qancha maxsulot qo'shmoqchisiz?" +
                                " omborda " + products[2].getQty() + " ta mavjud  ");
                        scanner = new Scanner(System.in);
                        num = scanner.nextInt();
                        products[2].setAdd(num);
                        System.out.println("omborga " + num +" ta "+products[2].getName()+" qo'shildi " +
                                "jami: " + products[2].getAdd() + " ta "+products[2].getName()+" bo'ldi");
                        break;
                    }
                case "4":
                    return;
            }
        }
     }

    private static void callMethod(Magazine products) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Maxsulot turi: ");
        products.setName(scanner.nextLine());

        System.out.print("Maxsulot nomi: ");
        products.setName(scanner.nextLine());

        System.out.print("Maxsulot narxi: ");
        products.setPrice(scanner.nextDouble());

        System.out.print("Maxsulot soni: ");
        products.setQty(scanner.nextInt());
        System.out.println();

    }
}
