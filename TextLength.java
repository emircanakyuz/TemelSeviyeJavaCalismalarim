import java.util.Scanner;

public class TextLength {
    public static void main(String args []){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter text..");
        String text= input.nextLine();
        text= text + (char)0;
        int i=0;
        while (text.charAt(i)!=(char)0){
            i++;
            }
        System.out.println("The numerical length of your text: " + i);
        }
    }
