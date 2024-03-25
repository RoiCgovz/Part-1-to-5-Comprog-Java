package Chapter35;
import java.util.Scanner;

public class ImprovedSquareRootProgram {
    public static void main(String[] args) 
    {
        double x;
        Scanner scan = new Scanner(System.in);
        String input;

        do {
            do {
                System.out.print("Enter a number --> ");
                x = scan.nextDouble();
                if (x >= 0) 
                {
                    System.out.println("Square root of " + x + " is " + Math.sqrt(x));
                } 
                else 
                {       
                    System.out.println(">> Number must be positive <<");
                }
            } while (x < 0);
            scan.nextLine();

            System.out.print("Do you wish to continue? (yes or no) --> ");
            input = scan.nextLine();
            do
            {
                System.out.println(">>>Please respond with 'yes' or 'no'<<<");
                System.out.print("Do you wish to continue? (yes or no) --> ");
                input = scan.nextLine();
            } while (!input.equals("yes") && !input.equals("no"));

        } while (input.equals("yes"));

        System.out.println("Bye");
        scan.close();   
    } 
}
