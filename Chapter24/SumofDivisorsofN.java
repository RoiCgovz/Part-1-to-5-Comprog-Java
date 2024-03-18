package Chapter24;

import java.util.Scanner;

public class SumofDivisorsofN {
     public static void main(String[] args) {
        int N, sumOfDivisors = 0;
        boolean isPerfect;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer N: ");
        N = scanner.nextInt();

        for (int i = 1; i <= N / 2; i++) 
        {
            if (N % i == 0) 
            {
                sumOfDivisors += i;
            }
        }

        isPerfect = (sumOfDivisors == N);

        System.out.println("Sum of all divisors of " + N + ": " + sumOfDivisors);

        if (isPerfect) 
        {
            System.out.println(N + " is a perfect number.");
        } 
        else 
        {
            System.out.println(N + " is not a perfect number.");
        }
        scanner.close();
    }
    
}
