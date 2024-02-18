import java.util.Scanner;

public class Exercise4 
{
    public static void main (String[] args)
    {
        double x, y , H, aMean;
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Enter X:");
        x = scan.nextDouble();
        System.out.println("Enter Y:");
        y = scan.nextDouble();

        aMean = (x + y ) /2;
        H = 2 / (1/x + 1/y);
        
        System.out.print("Arithmetic mean: " + aMean);
        System.out.print("\nHarmonic mean: " + H);
    }
}
