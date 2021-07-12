package Practice.AbramyanTask;

import java.util.Scanner;

public class BeginTask {
    public static void main(String[] args) {
        // begin-1
        Scanner begin = new Scanner(System.in);
/*        System.out.print("kvadratning tomonini kriting: ");
        double side=begin.nextDouble();
        System.out.print("peremetr="+4*side);*/

        // begin-2
/*        System.out.print("kvadratning tomonini kriting:");
        double side1=begin.nextDouble();
        System.out.println("kvadratnging yuzi="+Math.pow(side1,2));*/

        // begin-3
/*        System.out.println("to'gri to'rtburchakni tomonlarini kriting:");
        double aSide=begin.nextDouble();
        double bSide=begin.nextDouble();
        System.out.println("to'gri to'rtburchakni peremetri:"+4*(aSide+bSide));
        System.out.println("to'gri to'rtburchakni yuzi:"+aSide*bSide);*/

        // begin-4
/*        System.out.println("aylana diametrini kriting:");
        double circleDiametr=begin.nextDouble();
        System.out.printf(" aylana uzunligi L= %.2f",(Math.PI*circleDiametr));*/

        //begin-5
/*        System.out.print("kub tomonini kriting:");
        double cubicCapacity=begin.nextDouble();
        System.out.println("kub hajmi="+Math.pow(cubicCapacity,3));
        System.out.println("kub ning yuzi="+(6*Math.pow(cubicCapacity,2)));*/

        //begin-6
/*        System.out.println("paralapiped tomonlarini kritng");
        double side_A=begin.nextDouble();
        double side_B=begin.nextDouble();
        double side_C=begin.nextDouble();
        System.out.println("paralipiped hajmi="+side_C*side_A*side_B);
        System.out.println("paralipiped yuzi="+2*(side_C*side_A+side_B*side_A*side_C*side_B));*/

        //begin-7
/*
        System.out.println("Aylana radiusini kriting:");
        double circulRadius=begin.nextDouble();
        System.out.printf("Aylana uzunligi= %.2f \n",(2*Math.PI*circulRadius));
        System.out.printf("Aylana uzunligi= %.2f",(Math.PI*Math.pow(circulRadius,2)));
*/

        //begin-8
/*        System.out.println("ikkita raqam kriting:");
        double firstNumber=begin.nextDouble();
        double secondNumber=begin.nextDouble();
        System.out.println("ikki sonning o'rta arifmetigi="+(firstNumber+secondNumber)/2);*/

        //begin-9
/*        System.out.println("ikkita sonni kriting:");
        double firstNumber=begin.nextDouble();
        double secondNumber=begin.nextDouble();
        System.out.println("ikki sonning geometrik ildizi="+(Math.sqrt(firstNumber*secondNumber)));*/

        //begin-10
/*        System.out.println("ikki sonnign farqi,yi'gindisi,ko'paytmasi,ularning alohida kvadratlarini toping");
        double firstNumber=begin.nextDouble();
        double secondNumber=begin.nextDouble();
        if(firstNumber>0&&firstNumber>secondNumber){
            System.out.println(firstNumber+"musbat son va 2 sondan katta");
        }else{
            System.out.println(secondNumber+"musbat son va 1 sondan katta");
        }
        System.out.println("ikki sonning yig'indisi="+(firstNumber+secondNumber));
        System.out.println("ikki sonning ayirmasi="+(firstNumber-secondNumber));
        System.out.println("birinchi sonning kvadrati="+(Math.pow(firstNumber,2)));
        System.out.println("birinchi sonning kvadrati="+(Math.pow(secondNumber,2)));*/

        //begin-12
/*      System.out.println("to'gri to'rtburchakli uchburchakning 2 ta qiymat kriting:");
        double firstNumber=begin.nextDouble();
        double secondNumber=begin.nextDouble();
        System.out.println("uchburchakning gipotenuzasi="+(Math.sqrt((Math.pow(firstNumber,2)+(Math.pow(secondNumber,2))))));
        System.out.println("peremetri="+(firstNumber+secondNumber+(Math.sqrt((Math.pow(firstNumber,2)+(Math.pow(secondNumber,2)))))));*/

        //begin-13
/*        System.out.println("ikkita tutashgan aylanalarning radiuslarini kriting:");
        double firstRadius=begin.nextDouble();
        double secondRadius=begin.nextDouble();
        if (firstRadius>secondRadius){
            System.out.printf("birinchi aylananing yuzi=%.0f \n",(Math.PI*Math.pow(firstRadius,2)));
            System.out.printf("ikinchi aylananing yuzi=%.0f \n",(Math.PI*Math.pow(secondRadius,2)));
            System.out.printf("tutashgan joyning yuzi=%.0f",((Math.PI*Math.pow(firstRadius,2))-(Math.PI*Math.pow(secondRadius,2))));
        }else{
            System.out.println("R1 R2 dan katta ");
        }*/

        //begin-14
/*
        System.out.print("aylananing radiusi va yuzini topish uchun uning uzunligini kriting:");
        double circleLength=begin.nextDouble();
        System.out.printf("aylana radiusi R=%.0f \n",circleLength/(2*Math.PI));
        System.out.printf("aylana yuzi S=%.0f",Math.PI*Math.pow(circleLength/(2*Math.PI),2));
*/

        //begin-15
/*  System.out.println("aylana diametrini va yuzini toping buning uchun uning yuzi berilgan");
        double circleFace=begin.nextDouble();
        System.out.printf("aylana diametri D=%.0f \n",2*Math.sqrt(circleFace/Math.PI));
        System.out.printf("aylana uzunligi D=%.0f ",Math.PI*Math.sqrt(circleFace/Math.PI));*/

        //begin-16
/*        System.out.println("ikki nuqta orasidagi farqni toping");
        double firstPoint = begin.nextDouble();
        double secondPoint = begin.nextDouble();
        double result = firstPoint - secondPoint;
        if (result < 0)
            System.out.println("nuqtalar orasidagi farq=" + (-1) * result);
        else {
            System.out.println("nuqtalar orasidagi farq=" + result);
        }*/

        //begin-17
/*        System.out.println("uchta nuqta berilgan A,B,C AC va BC larni hamda ABC umumiy uzunligini toping: ");
        double point_A = 10, B = 33, C = 12;*/

        long uzlashtirma, uzgaruvchiBir, uzgarivuchiIkki = 0, bulinma = 0;
        char ch , ch1 ;
        int temp = 0, hisoblagich = 0;
        System.out.print("ixtiyoriy 15 xonagacha bo'lgan son kriting:");
        long raqam = begin.nextLong();
        uzlashtirma = raqam;
        while (uzlashtirma != 0) {
            uzlashtirma /= 10;
            temp++;
            if (temp == 1)
                bulinma = temp;
            else {
                bulinma *= 10;
            }
        }

        while (temp >= 1) {
            uzgaruvchiBir = raqam / bulinma;
            if (temp % 3 == 2 || temp == 2) {
                switch ((int) uzgaruvchiBir) {
                    case 1:
                        System.out.print(" o'n");
                        break;
                    case 2:
                        System.out.print(" yigirma");
                        break;
                    case 3:
                        System.out.print(" o'ttiz");
                        break;
                    case 4:
                        System.out.print(" qirq");
                        break;
                    case 5:
                        System.out.print(" ellik");
                        break;
                    case 6:
                        System.out.print(" oltmusht");
                        break;
                    case 7:
                        System.out.print(" yetmusht");
                        break;
                    case 8:
                        System.out.print(" sakson");
                        break;
                    case 9:
                        System.out.print(" to'qson");
                        break;
                }
            } else {
                switch ((int) uzgaruvchiBir) {
                    case 1:
                        System.out.print(" bir");
                        break;
                    case 2:
                        System.out.print(" ikki");
                        break;
                    case 3:
                        System.out.print(" uch");
                        break;
                    case 4:
                        System.out.print(" to'rt");
                        break;
                    case 5:
                        System.out.print(" besht");
                        break;
                    case 6:
                        System.out.print(" olti");
                        break;
                    case 7:
                        System.out.print(" yetti");
                        break;
                    case 8:
                        System.out.print(" sakkiz");
                        break;
                    case 9:
                        System.out.print(" to'qqiz");
                        break;
                }
            }
            if (raqam <= 9999&&raqam>1000) {
                uzgarivuchiIkki = raqam;
                String str = String.valueOf(uzgarivuchiIkki);
                String str1 = str.substring(1);
                String str2 = str.substring(2);
            }

            if (temp % 3 == 0 ) {
                System.out.print(" yuz");
            }
            switch ((int) temp) {
                case 4:
                    System.out.print(" ming");
                    break;
                case 7:
                    System.out.print(" million");
                    break;
                case 10:
                    System.out.print(" milliard");
                    break;
                case 13:
                    System.out.print(" trillion");
                    break;
            }
            raqam %= bulinma;
            bulinma /= 10;
            temp--;
        }


    }
}
