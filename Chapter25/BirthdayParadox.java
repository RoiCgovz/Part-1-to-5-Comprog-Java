package Chapter25;

import java.util.Scanner;
public class BirthdayParadox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        int guests = scanner.nextInt();
        scanner.close();

        double probability = 1.0;
        int n = 365; // Total number of days in a year

        for (int i = 0; i < guests; i++) {
            probability *= (double) (n - i) / n;
        }

        System.out.println("Probability that no two guests share a birthday: " + probability);

        // Find the number of guests needed for probability to be more than 0.5
        int numGuests = 0;
        double cumulativeProbability = 1.0;

        while (cumulativeProbability > 0.5) {
            numGuests++;
            cumulativeProbability *= (double) (n - numGuests) / n;
        }

        System.out.println("Number of guests needed for >50% chance of no shared birthdays: " + numGuests);
    }
}
