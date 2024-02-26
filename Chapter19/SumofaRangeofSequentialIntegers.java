package Chapter19;

import java.util.Scanner;

public class SumofaRangeofSequentialIntegers 
{
    public static void main(String[] args) 
    {
        int low,high,sumToHigh,sumToLower,sumBetweenRange;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter low:");
        low = scan.nextInt();

        System.out.println("Enter high:");
        high = scan.nextInt();

        sumToHigh = (high * (high + 1)) / 2;

        sumToLower = (low - 1) * ((low - 1) + 1) / 2;
        sumBetweenRange = sumToHigh - sumToLower;

        System.out.println("Sum = " + sumBetweenRange);
        scan.close();
    }
}
