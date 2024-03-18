package Chapter23;
import java.util.Scanner;

public class ModifiedMillionDollars 
{
    public static void main(String[] args) 
    {
        double annualInterestRate, initialAmount, annualContribution, dollars,interest;
        int year = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the annual interest rate (in percentage): ");
        annualInterestRate = scanner.nextDouble() / 100.0;
        System.out.print("Enter the initial investment amount: ");
        initialAmount = scanner.nextDouble();
        System.out.print("Enter the annual contribution amount: ");
        annualContribution = scanner.nextDouble();
        dollars = initialAmount;
        while (dollars < 1000000) 
        {
            year++;
            interest = dollars * annualInterestRate;
            dollars += interest + annualContribution;
            System.out.printf("Year %d: $%.2f%n", year, dollars);
        }
        System.out.println("After " + year + " years, the investment reaches or exceeds one million dollars.");

        scanner.close();
    }
}
