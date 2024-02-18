import java.util.Scanner;

public class Chap15Ex1 
{
    public static void main(String[] args) 
    {
        double val, approx;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x: ");
        val = scan.nextDouble();
        scan.close();

        approx = Math.pow(1 + 1 / val, val);
        
        System.out.printf("Approximation to e: %.7f\n", approx);
        
    }    
}
