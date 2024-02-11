import java.util.Scanner;

public class BasitMethodOrnekleri2 {
    public static void main(String[] args) {
        System.out.println(toplama());
    }

    public static int toplama() {
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Toplanılacak sayıları giriniz. Sonlandırmak için 0 rakamını kullanınız.");
        for (; ; ) {
            int giris = input.nextInt();
            toplam = giris + toplam;
            if (giris == 0) {
                break;
            }
        }
        System.out.println("Toplam: ");
        return toplam;
    }

    public static int carpma() {
        int carpim = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("çarpılacak sayıları giriniz. Sonlandırmak için 0 rakamını kullanınız.");
        for (; ; ) {
            int giris = input.nextInt();
            if (giris == 0) {
                break;
            }
            carpim = giris * carpim;

        }
        System.out.println("Carpım: ");
        return carpim;
    }

    public static float bölme() {
        Scanner input = new Scanner(System.in);
        System.out.println("bölünecek sayıları giriniz.");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int a = Math.max(sayi1, sayi2);
        int b = Math.min(sayi1, sayi2);
        float sonuc = a / b;
        System.out.println("Bölme: ");
        return sonuc;
    }

    public static int cikarma() {
        int sonuc=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Çıkarılacak sayıları giriniz. Sonlandırmak için 0 rakamını kullanınız.");
        for (; ; ) //For ile sonsuz döngü bu şekilde yapılabilir, burada daha doğru kullanım while ya da do wihle döngülerinden biri olacaktır.
        {
            int giris = input.nextInt();
            if (giris == 0) {
                break;
            }
            sonuc = Math.max(sonuc, giris) - Math.min(sonuc, giris);
        }
        return sonuc;
    }
}