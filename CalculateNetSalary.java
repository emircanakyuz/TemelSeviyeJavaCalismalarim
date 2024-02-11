import java.util.Scanner; //The import keyword is used to add libraries.

public class CalculateNetSalary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //We define Scanner Class to receive input from the user.
        System.out.println("Enter your registration number: ");
        String registrationNumber = input.nextLine(); //We assigned the value we received from the user to the variable named registrationNumber.

        System.out.println("Enter your working hour:");
        int workingHour = input.nextInt(); //We assigned the value we received from the user to the variable named workingHour.

        System.out.println("Write your hourly rate:");
        double hourlyRate = input.nextDouble();

        double salary = workingHour * hourlyRate;
        double bonus = (salary * 0.14);
        double tax = (salary * 0.15);
        double netSalary = (salary - (tax + bonus));

        System.out.println(registrationNumber + " Employee's net salary:" + netSalary);
        System.out.println(registrationNumber + " Employee bonus:" + bonus + " and tax:" + tax);
    }
}
