import java.util.Scanner;

public class DizideSayiArama {
    public static void main(String Args[]) {
        int[] rastgeleSayiDizisi = new int[10];
        for (int i = 0; i < 10; i++) {
            rastgeleSayiDizisi[i] = (int) (Math.random() * 30 + 1);
        }
        for (int sayi:rastgeleSayiDizisi){
            System.out.print("-" + sayi);
        }

        Scanner input = new Scanner(System.in);
        System.out.println( "\n" + "Lütfen aratmak istediğinz sayıyı giriniz.");
        int aranacakSayi = input.nextInt();

        boolean sayiMevcut=false;

        for (int i=0;i<rastgeleSayiDizisi.length;i++){
            if (aranacakSayi==rastgeleSayiDizisi[i]){
                sayiMevcut=true;
            }
        }
        if (sayiMevcut){
            System.out.println("Aradığınız sayı dizide mevcut.");
        }else {
            System.out.println("Aradığınız sayı dizide mevcut değil.");
        }
    }

/*
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi = input.nextInt();

        boolean sayiAsalMi=true;

        for (int i=2;i<sayi;i++){
            if (sayi%i==0){
                sayiAsalMi=false;
            }
        }
        if (sayiAsalMi) {
            System.out.println("Sayı asal.");
        } else System.out.println("Sayı asal değil.");

// ------------------------------------------------------------------------------------------

        Scanner input=new Scanner(System.in);
        System.out.println("Bir harf yazınız");
        String harf=input.nextLine();

        String sesliHarfler="a,e,ı,i,o,ö,u,ü";
        String sessizHarfler="b, c, ç, d, f, g, ğ, h, j, k, l, m, n, p, r, s, ş, t, v, y, z";

        if (sesliHarfler.contains(harf)){
            System.out.println("Girdiğiniz harf sesli");
        }else System.out.println("Girdiğiniz harf sessiz.");

// -------------------------------------------------------------------------------------

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi=input.nextInt();

        int toplam=0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                toplam=toplam+i;
            }
        }
        if (toplam==sayi){
            System.out.println("Girdiğiniz sayı mükemmel bir sayıdır.");
        }
        else System.out.println("Girdiğiniz sayı mükemmel bir sayı değilir.");
*/
}