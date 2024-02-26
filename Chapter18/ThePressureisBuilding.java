package Chapter18;
import java.util.Scanner;

public class ThePressureisBuilding 
{
     public static void main(String[] args) 
     {
        int rightFront,leftFront,rightRear,leftRear;
        boolean frontTiresWithinRange, rearTiresWithinRange;
        int minPressure = 35;
        int maxPressure = 45;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input right front pressure");
        rightFront = scan.nextInt();

        System.out.println("Input left front pressure");
        leftFront = scan.nextInt();

        System.out.println("Input right rear pressure");
        rightRear = scan.nextInt();

        System.out.println("Input left rear pressure");
        leftRear = scan.nextInt();

        frontTiresWithinRange = Math.abs(rightFront - leftFront) <= 3 && rightFront >= minPressure && rightFront <= maxPressure && leftFront >= minPressure && leftFront <= maxPressure;
        rearTiresWithinRange = Math.abs(rightRear - leftRear) <= 3 && rightRear >= minPressure && rightRear <= maxPressure && leftRear >= minPressure && leftRear <= maxPressure;

        if (frontTiresWithinRange && rearTiresWithinRange) 
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
