package PDP.OOPpracticeWithBrotherHamza.AnyTest;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String str = "zzzzjkzoooopzup";
        System.out.println(zipZap(str));
    }
    public static String zipZap(String str) {
        return str.replaceAll("z.p","zp");


    }
}
