import java.util.Scanner;

public class Chap14Ex3 
{
    public static void main (String[] args)
    {
        double interest, numberOfYears;
        Scanner scan = new Scanner(System.in);

        System.out.print("Interest Rate in Whole Number: ");
        interest = scan.nextDouble();
        
        numberOfYears = 72.0 / interest;
        
        System.out.print("Total Number of Years: " + numberOfYears);
        

    }    
}
