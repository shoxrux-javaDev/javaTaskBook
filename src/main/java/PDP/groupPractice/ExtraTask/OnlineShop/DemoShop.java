package PDP.groupPractice.ExtraTask.OnlineShop;

import java.util.Scanner;

public class DemoShop {
    public static void main(String[] args) {
        System.out.println("Online xaridlar do'konimizga xush kelibsiz (*_*)");
        Scanner scanner = new Scanner(System.in);
        int num1;
        Shop productOne = new Shop();
        callMethod(productOne, scanner);
        System.out.println();

        Shop productTwo = new Shop();
        callMethod(productTwo, scanner);
        System.out.println();

        Shop productThree = new Shop();
        callMethod(productThree, scanner);
        while (true) {
            System.out.println("iltimos kerakli maxsulotni tanlang: 1-" + productOne.getName() + "  2-" +
                    productTwo.getName() + "  3-" + productThree.getName() + "  4-exit");
            String chooseProduct = scanner.nextLine();
            switch (chooseProduct) {
                case "1": {
                    System.out.print("iltimos optsiyani tanlang: 1-sotib olish 2-omborga qo'shish  ");
                    String chooseMenuOne = scanner.nextLine();
                    if (chooseMenuOne.equals("1")) {
                        System.out.print("qancha sotib olmoqchisiz?" + " omborda "
                                + productOne.getQuantity() + "ta mavjud  ");
                         num1 = scanner.nextInt();
                        if (productOne.getQuantity() >= num1) {
                            productOne.setQuantity(num1);
                            System.out.println("Xaridingiz uchun rahmat! umumiy summa " + productOne.getPrice() * num1 +
                                    " so'm. Siz " + num1 + " ta " + productOne.getName() + " harid qildingiz");
                            break;
                        } else {
                            System.out.println("siz so'ragan qiymat omborda mavjud emas!!! qaytadan urinib ko'ring");
                            break;
                        }

                    } else if (chooseMenuOne.equals("2")) {
                        System.out.print("qancha qo'shmoqchisiz? omborda " + productOne.getQuantity() + " ta mavjud");
                         num1 = scanner.nextInt();
                        if (num1 != 0) {
                            productOne.setAdding(num1);
                            System.out.println("Omborga " + num1 + " ta " + productOne.getName() + " qo'shildi"
                                    + " Jami: " + productOne.getAdding() + " ta ");
                            break;
                        }
                    } else {
                        System.out.println("noto'gri qiymat kritildi qaytadan urinib ko'ring");
                        break;
                    }
                }
                case "2": {
                    System.out.print("iltimos optsiyani tanlang: 1-sotib olish 2-omborga qo'shish  ");
                    String chooseMenuTwo = scanner.nextLine();
                    if (chooseMenuTwo.equals("1")) {
                        System.out.print("qancha sotib olmoqchisiz?" + " omborda " + productTwo.getQuantity() + "ta mavjud  ");
                         num1 = scanner.nextInt();
                        if (productTwo.getQuantity() >= num1 && productTwo.getQuantity() > 0) {
                            productTwo.setQuantity(num1);
                            System.out.println("Xaridingiz uchun rahmat! umumiy summa " + productTwo.getPrice() * num1 +
                                    " so'm. Siz " + num1 + " ta " + productTwo.getName() + " harid qildingiz");
                            break;
                        } else {
                            System.out.println("siz so'ragan qiymat omborda mavjud emas!!! qaytadan urinib ko'ring");
                            break;
                        }

                    } else if (chooseMenuTwo.equals("2")) {
                        System.out.print("qancha qo'shmoqchisiz? omborda " + productTwo.getQuantity() + " ta mavjud  ");
                         num1 = scanner.nextInt();
                        if (num1 != 0) {
                            productTwo.setAdding(num1);
                            System.out.println("Omborga " + num1 + " ta " + productTwo.getName() + " qo'shildi"
                                    + " Jami: " + productTwo.getAdding() + " ta ");
                            break;
                        }
                    } else {
                        System.out.println("noto'gri qiymat kritildi qaytadan urinib ko'ring");
                        break;
                    }
                }
                case "3": {
                    System.out.print("iltimos optsiyani tanlang: 1-sotib olish 2-omborga qo'shish  ");
                    String chooseMenuthree = scanner.nextLine();
                    if (chooseMenuthree.equals("1")) {
                        System.out.print("qancha sotib olmoqchisiz?" + " omborda " + productThree.getQuantity() + "ta mavjud");
                         num1 = scanner.nextInt();
                        if (productThree.getQuantity() >= num1 && productThree.getQuantity() > 0) {
                            productThree.setQuantity(num1);
                            System.out.println("Xaridingiz uchun rahmat! umumiy summa " + productTwo.getPrice() * num1 +
                                    " so'm. Siz " + num1 + " ta " + productThree.getName() + " harid qildingiz");
                            break;
                        } else {
                            System.out.println("siz so'ragan qiymat omborda mavjud emas!!! qaytadan urinib ko'ring");
                            break;
                        }
                    } else if (chooseMenuthree.equals("2")) {
                        System.out.print("qancha qo'shmoqchisiz? omborda " + productThree.getQuantity() + " ta mavjud");
                         num1 = scanner.nextInt();
                        if (num1 != 0) {
                            productThree.setAdding(num1);
                            System.out.println("Omborga " + num1 + " ta " + productThree.getName() + " qo'shildi"
                                    + " Jami: " + productThree.getAdding() + " ta ");
                            break;
                        }
                    } else {
                        System.out.println("noto'gri qiymat kritildi qaytadan urinib ko'ring");
                        break;
                    }
                }
                case "4":
                    return;
            }
        }
    }

    private static void callMethod(Shop productOne, Scanner scanner) {
        System.out.print("maxsulot turi: ");
        productOne.setName(scanner.nextLine());

        System.out.print("maxsulot nomi: ");
        productOne.setName(scanner.nextLine());

        scanner = new Scanner(System.in);
        System.out.print("maxsulot narxi: ");
        productOne.setPrice(scanner.nextInt());

        System.out.print("maxsulot soni: ");
        productOne.setQuantity(scanner.nextInt());
        System.out.println();
    }

}
