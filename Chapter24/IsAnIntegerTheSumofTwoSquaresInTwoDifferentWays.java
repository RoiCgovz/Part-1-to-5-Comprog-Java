package Chapter24;

import java.util.Scanner;

public class IsAnIntegerTheSumofTwoSquaresInTwoDifferentWays {
    public static void main(String[] args) 
    {
        int count = 0, N;
        double remainder,sqrt;
        Scanner scanner = new Scanner(System.in);

        System.out.print("N --> ");
        N = scanner.nextInt();
        scanner.close();


        for (int i = 1; i <= Math.sqrt(N); i++) 
        {
            remainder = N - i * i;
            sqrt = Math.sqrt(remainder);
            if (sqrt == (int)sqrt) 
            {
                count++;
                int j = (int) sqrt;
                System.out.println(N + " is the sum of 2 squares");
                System.out.println(N + " == " + i + "*" + i + " + " + j + "*" + j);
            }
        }
        
        if (count == 0) {
            System.out.println(N + " is not the sum of 2 squares");
        }
    }
}
