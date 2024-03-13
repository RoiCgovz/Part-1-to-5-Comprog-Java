package Chapter21;
import java.util.Scanner;
public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 1.0;
        char response;
        boolean resLoop = true;
        boolean isLooped = true;

       do
       {
            System.out.println("Enter X");
            double x = scanner.nextDouble();

            System.out.println("Enter N");
            int n = scanner.nextInt();

            if (n < 0)
                System.out.println("N must be a positive integer.");   
            else 
            {

                for (int i = 0; i < n; i++) 
                {   
                    result *= x;
                }
                System.out.println(x + " raised to the power " + n + " is: " + result);
                System.out.println("--------------------------------------------------");
            }
            do
            {
                System.out.println("\nWould you like to loop again? [Y/N] ");
                response = scanner.next().charAt(0);
                if (response == 'y' || response == 'Y')
                {
                    isLooped= true;
                    resLoop = false;
                }
                else if (response == 'n' || response == 'N')
                {
                    isLooped = false; 
                    resLoop = false;
                }
                else
                {
                    System.out.print("Input must be Y/N.");
                    resLoop = true;
                    isLooped = true;
                }
            } while (resLoop);
            
        }   while (isLooped);
        scanner.close();
    }
}
