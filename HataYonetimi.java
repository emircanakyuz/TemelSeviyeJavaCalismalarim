package SinavCalismalari;

import java.util.Scanner;

public class HataYonetimi {
    public static void toplamaIslemi() {
        int sayi1,sayi2;
        Scanner input = new Scanner(System.in);
        for (; ; ) {
            try {
                System.out.println("1. sayıyı giriniz.");
                sayi1 = Integer.parseInt(input.nextLine());
                break;
            } catch (Exception exception) {
                System.out.println("Harf değil sayı girmelisiniz.");
            }
        }

        for (; ; ) {
            try {
                System.out.println("2. sayıyı giriniz.");
                sayi2 = Integer.parseInt(input.nextLine());
                break;
            } catch (Exception exception) {
                System.out.println("Harf değil sayı girmelisiniz.");
            }
        }
        System.out.println("Sonuç= " + (sayi1+sayi2));
    }
}
