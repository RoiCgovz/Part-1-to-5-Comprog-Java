package Chapter21;
import java.util.Scanner;
public class WedgeofStars 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfStars;
        System.out.println("Initial number of stars");
        numberOfStars = scanner.nextInt();
        
        for (int i = numberOfStars; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
