package Chapter24;
import java.util.Scanner;

public class IsanIntegertheSumofTwoSquares {
    public static void main(String[] args) 
    {
        boolean isSumOfSquares = false;
        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer N: ");
        N = scanner.nextInt();

        for (int a = 0; a * a <= N; a++) 
        {
            for (int b = 0; b * b <= N; b++) 
            {
                if (a * a + b * b == N) 
                {
                    isSumOfSquares = true;
                    break;
                }
            }
            if (a * a > N) 
            {
                break;
            }
        }

        if (isSumOfSquares) 
        {
            System.out.println(N + " is the sum of two squares of two integers.");
        } 
        else 
        {
            System.out.println(N + " is not the sum of two squares of two integers.");
        }
        scanner.close();
    }

}
