package Chapter18;

import java.util.Scanner;

public class MoreTirePressure 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Initialize the variable to check if all pressures are within range
        boolean goodPressure = true;

        // Get input for tire pressures and check pressure range
        System.out.print("Input right front pressure: ");
        int rightFrontPressure = scanner.nextInt();

        if (rightFrontPressure < 35 || rightFrontPressure > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        System.out.print("Input left front pressure: ");
        int leftFrontPressure = scanner.nextInt();

        if (leftFrontPressure < 35 || leftFrontPressure > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        System.out.print("Input right rear pressure: ");
        int rightRearPressure = scanner.nextInt();

        if (rightRearPressure < 35 || rightRearPressure > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        System.out.print("Input left rear pressure: ");
        int leftRearPressure = scanner.nextInt();

        if (leftRearPressure < 35 || leftRearPressure > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        // Check if the inflation is OK based on equality and pressure range
        boolean frontTiresOK = rightFrontPressure == leftFrontPressure;
        boolean rearTiresOK = rightRearPressure == leftRearPressure;

        // Display the final message
        if (frontTiresOK && rearTiresOK && goodPressure) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is BAD");
        }

        scanner.close();
    }
}
