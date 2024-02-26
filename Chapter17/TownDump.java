package Chapter17;

import java.util.Scanner;

public class TownDump 
{
     public static void main(String[] args) 
     {
        int trashWeight, additionalWeight, additionalHundredPounds;
        final int baseWeight = 200;
        final double baseCharge = 20.0;
        final double additionalChargePerHundredPounds = 8.0;
        double totalCharge;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the weight of the trash load (in pounds): ");
        trashWeight = scan.nextInt();

        if (trashWeight <= baseWeight) 
        {
            totalCharge = baseCharge;
        } 
        else 
        {
            additionalWeight = trashWeight - baseWeight;
            additionalHundredPounds = (int) Math.ceil((double) additionalWeight / 100);
            totalCharge = baseCharge + additionalHundredPounds * additionalChargePerHundredPounds;
        }
        System.out.printf("The charge for disposing of %d pounds of trash is: $%.2f%n", trashWeight, totalCharge);
        scan.close();
    }    
}
