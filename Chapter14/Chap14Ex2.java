import java.util.Scanner;

public class Chap14Ex2 
{
    public static void main (String[] args)
    {
        double V, P, r, n ,t, nt, proRN, resRNT;
        Scanner scan = new Scanner(System.in);

        System.out.print("Initial Deposit: ");
        P = scan.nextDouble();
        System.out.print("Interst rate: ");
        r = scan.nextDouble();
        System.out.print("Times per year: ");
        n = scan.nextDouble();
        System.out.print("Number of years: ");
        t = scan.nextDouble();

        nt = n * t;
        proRN = (1 + (r/n));
        resRNT = Math.pow(proRN, nt);
        V = P * resRNT;
        Math.round(V);

        System.out.printf("Value: $%.2f ", V);

        

        
    }
}
