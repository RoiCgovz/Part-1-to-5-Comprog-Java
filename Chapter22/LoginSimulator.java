package Chapter22;

import java.util.Scanner;

public class LoginSimulator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        while (true) {
            System.out.print("User Name: ");
            username = scanner.nextLine();
            System.out.print("Password : ");
            password = scanner.nextLine();

            if (username.equals("joy") && password.equals("sun")) {
                System.out.println("You have logged on with priority 4");
            } else if (username.equals("gates") && password.equals("monopoly")) {
                System.out.println("You have logged on with priority 1");
            } else if (username.equals("jobs") && password.equals("apple")) {
                System.out.println("You have logged on with priority 3");
            } else if (username.equals("root") && password.equals("secret")) {
                System.out.println("You have logged on with priority 5");
            } else if (username.equals("quit") && password.equals("exit")) {
                System.out.println("System shutting down.\nBye.");
                break;
            } else {
                System.out.println("Logon failed");
            }
        }
        scanner.close();
    }
}

