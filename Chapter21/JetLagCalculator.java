package Chapter21;

import java.util.Scanner;

public class JetLagCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter number of hours of travel: ");
        int hours = scanner.nextInt();

        System.out.print("Enter number of time zones crossed: ");
        int zones = scanner.nextInt();

        System.out.print("Enter departure time (in 24-hour format): ");
        int departureTime = scanner.nextInt();

        System.out.print("Enter arrival time (in 24-hour format): ");
        int arrivalTime = scanner.nextInt();

        // Determine Departure Code
        int depart;
        if (departureTime >= 8 && departureTime < 12) {
            depart = 0;
        } else if (departureTime >= 12 && departureTime < 18) {
            depart = 1;
        } else if (departureTime >= 18 && departureTime < 22) {
            depart = 3;
        } else if (departureTime >= 22 || departureTime < 1) {
            depart = 4;
        } else {
            depart = 5;
        }
        // Determine Arrival Code
        int arrive;
        if (arrivalTime >= 8 && arrivalTime < 12) {
            arrive = 4;
        } else if (arrivalTime >= 12 && arrivalTime < 18) {
            arrive = 2;
        } else if (arrivalTime >= 18 && arrivalTime < 22) {
            arrive = 0;
        } else if (arrivalTime >= 22 || arrivalTime < 1) {
            arrive = 1;
        } else {
            arrive = 3;
        }

        // Calculate days of recovery
        double daysOfRecovery = (hours / 2.0 + (zones - 3) + depart + arrive) / 10.0;

        // Display the result
        System.out.println("Number of days needed for recovery: " + daysOfRecovery);

        // Close the scanner
        scanner.close();
    }
}
