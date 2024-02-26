package Chapter20;

import java.util.Scanner;

public class HarmonicSum {
     public static void main(String[] args) 
     {
        int N;
        double sum = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N:");
        N = scan.nextInt();

        for (int i = 1; i <= N; i++) 
        {
            sum += 1.0 / i;
        }

        System.out.println("Sum is: " + sum);
        scan.close();
    }
}
