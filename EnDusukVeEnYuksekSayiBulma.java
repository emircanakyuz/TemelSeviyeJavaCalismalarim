import java.util.Scanner;

public class EnDusukVeEnYuksekSayiBulma {
    public static void main(String[] args) {

        Integer [] sayilar = new Integer[5];
        Scanner input = new Scanner(System.in);
        System.out.println("5 tane sayı giriniz.");

        int i, min, max = 0;
        for (i=0;i<5;i++){
            sayilar[i]=input.nextInt();
        }
            min=sayilar[0];
            max=sayilar[0];
        for (i=0;i<5;i++){
            if (sayilar[i]<min){
                min=sayilar[i];
            }
            if (sayilar[i]>max){
                max=sayilar[i];
            }
        }
        System.out.println("en yüksek sayı: " + max + " en düşük sayı: " + min);
    }
}
