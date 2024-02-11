import java.util.Scanner;

public class SwitchCaseKullanımınaOrnek {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz.");
        String not=input.nextLine();

        switch (not){
            case "A":
                System.out.println("Mükemmel geçtin");
                break;
            case "B":
                System.out.println("İyi geçtin");
                break;
            case "C":
                System.out.println("Eh işte geçtin");
                //break ifadesi koyulmadığı için C notu girildiği zaman hem eh işte geçtin hem de kıl payı yırttın lan ifadesini yazıcak.
            case "D":
                System.out.println("Kıl payı yırttın..");
                break;
            case "F":
                System.out.println("Kaldın..");
                break;
        }
    }
}