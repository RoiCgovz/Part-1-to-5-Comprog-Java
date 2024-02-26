package Chapter19;

import java.util.Scanner;

public class SumofSequentialIntegers 
{
    public static void main(String[] args) 
    {
        int N,loopSum = 0,formulaSum;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N:");
        N = scan.nextInt();

        for (int i = 1; i <= N; i++) 
        {
            loopSum += i;
        }
        formulaSum = (N * (N + 1)) / 2;

        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);
        scan.close();
    }
}
