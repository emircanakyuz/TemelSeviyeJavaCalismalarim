import java.util.Scanner;

public class TwoDimensionalArrayExample {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("enter a word.");
        String input0=input.nextLine();
        System.out.println("enter a word.");
        String input1= input.nextLine();
        System.out.println("enter a word.");
        String input2= input.nextLine();
        System.out.println("enter a word.");
        String input3=input.nextLine();
        System.out.println("enter a word.");
        String input4= input.nextLine();
        System.out.println("enter a word.");
        String input5= input.nextLine();
        System.out.println("enter a word.");
        String input6= input.nextLine();
        System.out.println("enter a word.");
        String input7= input.nextLine();
        System.out.println("enter a word.");
        String input8= input.nextLine();
        String words[][]= new String[3][3];
        words [0][0]=input0;
        words [0][1]=input1;
        words [0][2]=input2;
        words [1][0]=input3;
        words [1][1]=input4;
        words [1][2]=input5;
        words [2][0]=input6;
        words [2][1]=input7;
        words [2][2]=input8;
        for (int i=0;i<3;i++){
            System.out.println("---------------is starting to print---------------");
            for (int j=0;j<3;j++){
                System.out.println(words[i][j]);
            }
        }
    }
}
