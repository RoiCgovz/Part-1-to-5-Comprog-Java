package Chapter21;
import java.util.Scanner;
public class FloatFactorial {
    public static void main(String[] args) {
        long N;
        double fact = 1.0, approximation;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Value of N: ");
        N = scan.nextLong();

        for (long i = 1; i <= N; i++) 
        {
            fact *= i;
        }

        System.out.println("Factorial of " + N + " is: " + fact);

        approximation = fact / (fact / N);
        System.out.println("Approximation of N: " + approximation);
        scan.close();
    }
    
}
