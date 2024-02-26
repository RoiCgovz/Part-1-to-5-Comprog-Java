package Chapter18;

import java.util.Scanner;

public class TirePressure 
{
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input right front pressure: ");
        int rightFrontPressure = scan.nextInt();

        System.out.print("Input left front pressure: ");
        int leftFrontPressure = scan.nextInt();

        System.out.print("Input right rear pressure: ");
        int rightRearPressure = scan.nextInt();

        System.out.print("Input left rear pressure: ");
        int leftRearPressure = scan.nextInt();

        boolean frontTiresOK = rightFrontPressure == leftFrontPressure;
        boolean rearTiresOK = rightRearPressure == leftRearPressure;

        if (frontTiresOK && rearTiresOK) 
        {
            System.out.println("Inflation is OK");
        } 
        else 
        {
            System.out.println("Inflation is NOT OK");
        }
        scan.close();
    }
}
