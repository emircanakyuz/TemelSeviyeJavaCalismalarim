import java.util.Scanner;

public class BasitMethodOrnekleri {
    public static void main(String[] arguments) {
        System.out.println(parolaOlusturma()); 
        //Buraya hangi metodu yazarsak o metod çalışacaktır.
        //Buraya yazdığımız metodun "void" olmamasına, bir değer döndürmesi gerektiğine dikkat edelim.   
    }

    public static int kücükSayi() {
        Scanner input = new Scanner(System.in);
        System.out.println("3 Adet Sayı Giriniz.");
        int sayilar[]=new int[3];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = input.nextInt();
        }
        int sonuc = Math.min(Math.min(sayilar[0], sayilar[1]), sayilar[2]);
        return sonuc;
    }

    public static float ortSayi() {
        int toplam = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıları giriniz.");
        for (i = 1; i <= 3; i++) {
            int giris = input.nextInt();
            toplam = giris + toplam;
        }
        float sonuc = toplam / i;
        return sonuc;
    }

    public static float ucgenHesabi() {
        Scanner input = new Scanner(System.in);
        System.out.println("tabanı giriniz");
        int taban = input.nextInt();
        System.out.println("yüksekliği giriniz");
        int yükseklik = input.nextInt();
        float sonuc = (yükseklik * taban / 2);
        return sonuc;
    }

    public static String parolaOlusturma() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen parolanızı giriniz.");
        String giris = input.nextLine();
        while(giris.length() < 8) {
            System.out.println("Parolanız 8 karakterden az olamaz. Lütfen tekrar giriniz.");
            giris = input.nextLine();
        }
        System.out.println("Parolanız: ");
    return giris;
    }
}