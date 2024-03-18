package Chapter23;

import java.util.Scanner;

public class HailstoneNumbers 
{
     public static void main(String[] args) 
     {
        int N , maxLength = 0,maxInteger = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        System.out.println(N);
        while (N != 1) 
        {
            if (N % 2 == 0) {
                N /= 2;
            } else {
                N = 3 * N + 1;
            }
            System.out.println(N);
            if (N > maxInteger) {
                maxInteger = N;
            }
            maxLength++;
        }
        System.out.println("Sequence length: " + (maxLength + 1)); 
        System.out.println("Maximum integer: " + maxInteger);
        scanner.close();
    }
}
