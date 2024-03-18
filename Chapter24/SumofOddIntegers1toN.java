package Chapter24;

import java.util.Scanner;

public class SumofOddIntegers1toN {
    public static void main(String[] args) {
        int N, sumOfOdds = 0,squareOfN;
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer N: ");
        N = scanner.nextInt();

        squareOfN = N * N;

        for (int i = 1; i <= N; i += 2) {
            sumOfOdds += i;
        }
        System.out.println("Sum of all odd integers from 1 to " + N + ": " + sumOfOdds);
        System.out.println("Square of " + N + ": " + squareOfN);
        scanner.close();
    }
}
