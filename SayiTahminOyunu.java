import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);

        int sayi= (int)(Math.random()*101);

        System.out.println("Lütfen 0 ve 100 aralığında sayı tahmininizi yazınız.");
        int tahmin=input.nextInt();
        tahmin=-1; 
        while (tahmin!=sayi){
            if (sayi<tahmin){
                System.out.println("Tahmininiz yüksek. Yeni bir tahminde bulununuz...");
                tahmin=input.nextInt();
            }
            else if (tahmin<sayi){
                System.out.println("Tahmininiz düşük yeniden tahminde bulununuz...");
                tahmin=input.nextInt();
            }
        }
        System.out.println("Tahmininiz doğru tebrikler, tahmin ettiğini sayı: " + sayi);
    }
}
