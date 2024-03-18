package Chapter23;

import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) 
    {
        double x = 0.0001, B, newX;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of B: ");
        B = scanner.nextDouble();

        if (B == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        if (B > 10000) {
            System.out.println("Error: B is too large for this program to handle.");
            return;
        }
        while (true) {
            newX = x * (2 - B * x);
            if (Math.abs(newX - x) < 1e-10) 
            { 
                System.out.printf("1/%.2f is approximately %.10f%n", B, newX);
                return;
            }
            x = newX;
        }
        
    }
}
