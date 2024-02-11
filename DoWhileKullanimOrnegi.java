import java.util.Scanner;

public class DoWhileKullanimOrnegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz 0 girilirse toplam sonlanır!");
        int giris = input.nextInt();

        int toplam=giris;
        do {
            System.out.println("Bir sayı giriniz 0 girilirse toplam sonlanır!");
            giris = input.nextInt();
            toplam=toplam+giris;
        } while (giris!=0);
        System.out.println("Sıfır girdiğiniz için toplam sonlandı. Toplam sonucu: " + toplam);
    }
}
