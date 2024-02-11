import java.util.Scanner;

public class AsalSayibulma{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int number = input.nextInt();
        boolean asalMı= true;
        for (int i=2;i<10;i++){
            if (number%i==0){
                asalMı=false;
                break;
            }
        }
        if (asalMı==true)
        {
            System.out.println("asal");
        }
        else System.out.println("Asal Değil");
    }
}
