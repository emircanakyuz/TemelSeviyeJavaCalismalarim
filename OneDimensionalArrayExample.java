import java.util.Scanner;

public class OneDimensionalArrayExample {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); //We define Scanner Class to receive input from the user.
        System.out.println("Enter a number"); 
        int userLogin0 = input.nextInt(); //We assigned the value we received from the user to the variable named kullanıcıGirisi0.
        System.out.println("Enter a number");
        int userLogin1 = input.nextInt();
        System.out.println("Enter a number");
        int userLogin2 = input.nextInt();
        System.out.println("Enter a number");
        int userLogin3 = input.nextInt();
        System.out.println("Enter a number");
        int userLogin4 = input.nextInt();
        System.out.println("Enter a number");
        int userLogin5 = input.nextInt();
        System.out.println("Enter a number");
        int userLogin6 = input.nextInt();
        // We assign the values we receive as variables as elements of the array.
        int userNumbers[] = {userLogin0, userLogin1, userLogin2, userLogin3, userLogin4, userLogin5, userLogin6};
        int maxNumber = userLogin0;
        int sumOfNumbers = 0;
        for (int i = 0; i < userNumbers.length; i++) { //The ".length" function returns the length of the array.
            if (maxNumber < userNumbers[i]) {
                maxNumber = userNumbers[i];
            }
        }
        System.out.println("Kullanıcının girdiği en büyük sayı: " + maxNumber);
        for (int j = 0; j < userNumbers.length; j++) {
            sumOfNumbers = sumOfNumbers + userNumbers[j];
        }
        System.out.println("The largest number entered by the user: " + sumOfNumbers);
        System.out.println("3rd number in index 2: " + userNumbers[2]);
        userNumbers[2]=5;
        System.out.println("3rd number in index 2: " + userNumbers[2]);
        System.out.println("------------is starting to print------------");
        for (int i=0;i<userNumbers.length;i=i+1){
            System.out.println(userNumbers[i]);
        }   
        /*  Dilerseniz dizi içerisindeki yazdırma işlemini aşağıdaki gibi de yapabilirsiniz..

        for(int number: userNumbers){
            System.out.println(number);
        } 
        */
    }
}