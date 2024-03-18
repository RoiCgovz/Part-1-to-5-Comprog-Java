package Chapter22;

import java.util.Scanner;
public class InRangeAdder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting the range from the user
        System.out.print("Low end of range: ");
        int low = scanner.nextInt();
        System.out.print("High end of range: ");
        int high = scanner.nextInt();

        // Initializing sums
        int sumInRange = 0;
        int sumOutOfRange = 0;

        // Getting integers from the user until 0 is entered
        while (true) {
            System.out.print("Enter data:\n");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num >= low && num <= high) {
                sumInRange += num;
            } else {
                sumOutOfRange += num;
            }
        }

        // Displaying the sums
        System.out.println("Sum of in range values: " + sumInRange);
        System.out.println("Sum of out of range values: " + sumOutOfRange);

        scanner.close();
    }
}
