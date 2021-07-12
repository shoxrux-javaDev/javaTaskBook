package PDP.groupPractice.ExtraTask.Region;

import java.util.Scanner;

public class MainDemo {
    public static Scanner scanner = new Scanner(System.in);
    public static District[] districts = new District[12];
    public static Region[] regions = new Region[12];
    public static Governor[] governor = new Governor[12];
    public static Republic[] republics = new Republic[10];

    public static void main(String[] args) {
        int numRepublic, numRegion, numDistrict;
        governorInfo();
        districtInfo();
        regionInform();
        setRepublicAndPresident();
        while (true) {
            republicInfo();
            numRepublic = scanner.nextInt();
            Republic republic = republics[numRepublic - 1];
            republic.printInfo();
            numRegion = scanner.nextInt();
            Region region = regions[numRegion - 1];
            region.printInfo();
            numDistrict = scanner.nextInt();
            District district = districts[numRegion - 1];
            if (numDistrict == 1) {
                district.printInfo();
            } else {
                System.out.println("the number was entered incorrectly");
                break;
            }
        }
    }

    public static void setRepublicAndPresident() {
        President president = new President("Shavkat", "Mirziyoyev", "Jizzax region." +
                                                                     " Zomin District", 3);
        republics[0] = new Republic("Uzbekistan", 448978, 33000000, president, regions);
    }

    public static void republicInfo() {
        System.out.println("Choose the Republic:");
        int index = 1;
        for (Republic republic : republics) {
            if (republic != null) {
                System.out.println(index + "." + republic.getName());
                index++;
            }
        }
    }

    public static void regionInform() {
        regions[0] = new Region("Andijon", 4303, 2965500, districts[0], governor[0]);
        regions[1] = new Region("Bukhara", 41937, 1843500, districts[1], governor[1]);
        regions[2] = new Region("Djizzak", 21179, 1301000, districts[2], governor[2]);
        regions[3] = new Region("Fergana", 7005, 3564800, districts[3], governor[3]);
        regions[4] = new Region("Kashkadarya", 28568, 3088800, districts[4], governor[4]);
        regions[5] = new Region("Khorezm", 6464, 1776700, districts[5], governor[5]);
        regions[6] = new Region("Namangan", 7181, 2652400, districts[6], governor[6]);
        regions[7] = new Region("Navoi", 109375, 942800, districts[7], governor[7]);
        regions[8] = new Region("Samarkand", 16773, 3651700, districts[8], governor[8]);
        regions[9] = new Region("Surkhandarya", 20099, 2462300, districts[9], governor[9]);
        regions[10] = new Region("Syrdarya", 4276, 803100, districts[10], governor[10]);
        regions[11] = new Region("Tashkent", 327, 2829300, districts[11], governor[11]);
    }

    public static void governorInfo() {
        governor[0] = new Governor("Shukhratbek", "Abdurakhmanov",
                "Andijan region. Paktaabad district", 7);
        governor[1] = new Governor("Botir", "Zaripov",
                "Bukhara region. Gijduon district", 2);
        governor[2] = new Governor("Ergash", "Saliev",
                "Djizzak region. Forish district", 4);
        governor[3] = new Governor("Khayrullo", "Bozarov",
                "Fergana region. Chartak district", 1);
        governor[4] = new Governor("Zoyir", "Mirzaev",
                "Kashkadarya region. Karshi district", 1);
        governor[5] = new Governor("Farxod", "Ermanov",
                "Republic Karakalpakstan. Amudarya district", 3);
        governor[6] = new Governor("Shavkat", "Abdurazakov",
                "Namangan region. Namangan district", 1);
        governor[7] = new Governor("Kobul", "Tursunov ",
                "Navoi region. Navoi district", 5);
        governor[8] = new Governor("Erkinjon", "Turdimov",
                "Samarkand region. Koshrabod district", 3);
        governor[9] = new Governor("Тўра", "Боболов",
                "Surkhandarya region. not recorded", 3);
        governor[10] = new Governor("Mirzaev", "Gofurjon",
                "Fergana region. Baghdad district", 1);
        governor[11] = new Governor("Jaxongir", "Artikkhodjaev",
                "Tashkent region. not recorded", 2);
    }

    public static void districtInfo() {
        districts[0] = new District("Andijan", 400, 198400, governor[0]);
        districts[1] = new District("Bukhara", 260, 191500, governor[1]);
        districts[2] = new District("Djizzak", 340, 150800, governor[2]);
        districts[3] = new District("Fergana", 200, 54000, governor[3]);
        districts[4] = new District("Karshi", 200, 110000, governor[4]);
        districts[5] = new District("Nukus", 280, 186200, governor[5]);
        districts[6] = new District("Namangan", 370, 146500, governor[6]);
        districts[7] = new District("Navai", 230, 86600, governor[7]);
        districts[8] = new District("Samarkand", 480, 160400, governor[8]);
        districts[9] = new District("Termiz", 320, 133400, governor[9]);
        districts[10] = new District("Gulistan", 290, 134500, governor[10]);
        districts[11] = new District("Tashkent", 290, 134500, governor[10]);
    }


}
