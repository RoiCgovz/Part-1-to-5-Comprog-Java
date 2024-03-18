package Chapter23;

import java.util.Scanner;

public class EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        double sum = 1.0;
        double term = 1.0;
        int n = 1;
        while (Math.abs(term) >= 1.0E-12) 
        {
            term *= x /n;
            sum += term;
            System.out.printf("n:%d\tterm: %s  sum: %s%n", n, term, sum);
            n++;
        }
        System.out.println("\nmy   e^x: " + sum);
        System.out.println("real e^x: " + Math.exp(x));

        scanner.close();
    }
}
