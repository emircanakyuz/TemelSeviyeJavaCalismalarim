import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args)
    {

        int[] sayilar = new int[8];

        Scanner input = new Scanner(System.in);
        System.out.println("Sırayla istediğiniz sayıları giriniz.");

        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = input.nextInt();
        }
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[i] > sayilar[j]) {
                    int tutucu = sayilar[i];
                    sayilar[i] = sayilar[j];
                    sayilar[j] = tutucu;
                }
            }
        }
        System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralanışı;"); // Aynı mantık ile büyükten küçüğe de sıralanabilir. 
        for (int i = 0; i < sayilar.length; i++) {
            toplam = toplam + sayilar[i];
            System.out.print(sayilar[i]);
            if (i < sayilar.length-1) {
                System.out.print(",");
            }
        }
        System.out.println('\n' + "Yazdığınız sayıların toplamı: " + toplam);
        int diziOrtancasi= (sayilar.length/2)-1;
        System.out.println("Küçükten büyüğe sıralanmış sayıların ortancası: " + sayilar[diziOrtancasi]);
    }
}