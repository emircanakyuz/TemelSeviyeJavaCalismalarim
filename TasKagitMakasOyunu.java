import java.util.Scanner;

public class TasKagitMakasOyunu {
    int kullaniciTercihi;
    int bilgisayarTercihi;

    public static void main(String[] args) {
        TasKagitMakasOyunu oyun = new TasKagitMakasOyunu();
        oyun.oyunuBaslat();
    }

    void oyunuBaslat() {
        kullaniciTercihiAl();
        bilgisayarTercihiBelirle();
        sonucuGoster();
        oyunTekrari();
    }

    void kullaniciTercihiAl() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tercihinizi yapın (0: Taş, 1: Kağıt, 2: Makas): ");
        kullaniciTercihi = input.nextInt();
    }

    void bilgisayarTercihiBelirle() {
        // Bilgisayarın tercihini rastgele belirleyelim
        bilgisayarTercihi = (int) (Math.random() * 3);
    }

    void sonucuGoster() {
        switch (kullaniciTercihi) {
            case 0:
                if (bilgisayarTercihi == 0) {
                    System.out.println("Kazanan yok, berabere! Siz: Taş, Bilgisayar: Taş");
                } else if (bilgisayarTercihi == 1) {
                    System.out.println("Kazanan bilgisayar! Siz: Taş, Bilgisayar: Kağıt");
                } else {
                    System.out.println("Kazanan siz! Siz: Taş, Bilgisayar: Makas");
                }
                break;
            case 1:
                if (bilgisayarTercihi == 0) {
                    System.out.println("Kazanan siz! Siz: Kağıt, Bilgisayar: Taş");
                } else if (bilgisayarTercihi == 1) {
                    System.out.println("Kazanan yok, berabere! Siz: Kağıt, Bilgisayar: Kağıt");
                } else {
                    System.out.println("Kazanan bilgisayar! Siz: Kağıt, Bilgisayar: Makas");
                }
                break;
            case 2:
                if (bilgisayarTercihi == 0) {
                    System.out.println("Kazanan bilgisayar! Siz: Makas, Bilgisayar: Taş");
                } else if (bilgisayarTercihi == 1) {
                    System.out.println("Kazanan siz! Siz: Makas, Bilgisayar: Kağıt");
                } else {
                    System.out.println("Kazanan yok, berabere! Siz: Makas, Bilgisayar: Makas");
                }
                break;
        }
    }
    void oyunTekrari() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tekrar oynamak ister misiniz? (Evet: 1, Hayır: 0)");
        if (input.nextInt() == 1) {
            oyunuBaslat();
        } else {
            System.out.println("Oyun bitti.");
            System.exit(0);
        }
    }
}
