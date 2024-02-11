import java.util.Scanner;

public class KelimeleriAlfabetikSiralamaOrnegi {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("sırasıyla birinci ve ikinci Kelimeyi giriniz.");
            String sehir1= input.nextLine();
            String sehir2= input.nextLine();
            int sonuc= sehir1.compareToIgnoreCase(sehir2);
            // compareToIgnoreCase karakterlerin unicode karşılıklarına göre karşılaştırma yapan bir methoddur.
            // Biraz daha açıklamak gerekirse;
            // Eğer birinci dize, ikinci dizeden önce geliyorsa, negatif bir tam sayı döndürür. Bu genellikle -1 olarak ifade edilir.
            // Eğer iki dize eşitse, yani karakterler aynı sıraya sahipse, 0 döndürür.
            // Eğer birinci dize, ikinci dizeden sonra geliyorsa, pozitif bir tam sayı döndürür. Bu genellikle 1 olarak ifade edilir.
            if (sonuc<0){
                System.out.println("girdiğiniz şehirlerin alfabetik sıralamsı: " + sehir1 + ", " + sehir2);
            }
            else {
                System.out.println("girdiğiniz şehirlerin alfabetik sıralamsı: " + sehir2 + ", " + sehir1);
        }
    }
}
