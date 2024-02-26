package Chapter20;

import java.util.Scanner;

public class AverageandStandardDeviationofN_Numbers 
{
    public static void main(String[] args) 
    {
        int N;
        double value; 
        double sum = 0.0;
        double sumOfSquares = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of values (N):");
        N = scan.nextInt();

        System.out.println("Enter the floating-point numbers:");

        for (int i = 0; i < N; i++) 
        {
            value = scan.nextDouble();
            sum += value;
            sumOfSquares += value * value;
        }

        double avg = sum / N;
        double avg2 = avg * avg;
        double avgSquare = sumOfSquares / N;
        double standardDeviation = Math.sqrt(avgSquare - avg2);

        System.out.println("Average is: " + avg);
        System.out.println("Standard Deviation is: " + standardDeviation);
        scan.close();
    }
}
