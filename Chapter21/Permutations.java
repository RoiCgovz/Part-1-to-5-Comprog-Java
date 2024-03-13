package Chapter21;
import java.util.Scanner;
public class Permutations {
     public static void main(String[] args) {
        long N, R;
        double factNR = 1.0, factN = 1.0, result;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Value of N: ");
        N = scan.nextLong();
        System.out.print("Enter Value of R: ");
        R = scan.nextLong();

        for (long i = N; i > N - R; i--) 
        {
            factNR *= i;
        }
        for (long i = 1; i <= N; i++) 
        {
            factN *= i;
        }
        result = factN / factNR;

        System.out.println("Result of N! / (N-R)!: " + result);
        scan.close();
    }
}
