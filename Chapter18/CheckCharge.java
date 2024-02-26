package Chapter18;

import java.util.Scanner;

public class CheckCharge 
{
    public static void main(String[] args) 
    {
        double checkingBalance, savingsBalance,serviceCharge;
        boolean noServiceCharge;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the balance in the checking account: ");
        checkingBalance = scan.nextDouble();

        System.out.print("Enter the balance in the savings account: ");
        savingsBalance = scan.nextDouble();

        noServiceCharge = checkingBalance > 1000 || savingsBalance > 1500;

        if (noServiceCharge) 
        {
            serviceCharge = 0;
        } 
        else 
        {
            serviceCharge = 0.15;
        }
        System.out.printf("The service charge for writing checks is: $%.2f%n", serviceCharge);
        scan.close();
    }
}
