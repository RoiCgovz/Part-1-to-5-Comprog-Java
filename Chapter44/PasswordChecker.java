/*This Program repeatedly asks the user for a proposed password until 
  the user enters an acceptable password. When the user enters an acceptable 
  password, the program writes a message and exits.

    Name: Roilene Vhinz Fajardo
    Date: May 6, 2024
    Time: 9:12 PM

*/
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password;
        boolean hasLowerCase;
        boolean hasUpperCase;
        boolean hasDigit;
        char ch;

        do {
            System.out.println("Enter your password:");
            password = scan.nextLine();
            hasLowerCase = false;
            hasUpperCase = false;
            hasDigit = false;

            if (password.length() < 7) {
                System.out.println("That password is not acceptable.");
                continue;
            }

            for (int i = 0; i < password.length(); i++) 
            {
                ch = password.charAt(i);
                if (Character.isLowerCase(ch)) 
                    hasLowerCase = true;
                else if (Character.isUpperCase(ch)) 
                    hasUpperCase = true;
                else if (Character.isDigit(ch)) 
                    hasDigit = true;
            }

            if (!hasLowerCase || !hasUpperCase || !hasDigit) 
                System.out.println("That password is not acceptable.");
             else 
                System.out.println("Acceptable password.");
                break;
            
        } while (true);
    }
}
