import java.util.Scanner;

public class KokHesaplamaOrneği {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen sırasıyla a, b ve c'yi giriniz.");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = b * b - (4 * (a * c));
        double x1, x2;

        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / 2 * a;
            x2 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("Girdiğiniz denklemin 2 farklı kökü vardır. Birinci kök: " + x1 + " İkinci kök: " + x2);
        }

        else if (delta < 0) {
            System.out.println("Denklemin reel kökü yoktur.");
        }

        else {
            double xeşit = -b / 2 * a;
            System.out.println("Girdiğiniz denklemin iki eşit kökü vardır. x1=x2: " + xeşit);
        }
    }
}
