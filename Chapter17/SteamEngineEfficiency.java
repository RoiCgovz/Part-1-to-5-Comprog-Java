package Chapter17;

import java.util.Scanner;

public class SteamEngineEfficiency 
{
    public static void main(String[] args) 
    {
        int airTemperature,steamTemperature;
        double efficiency;
        Scanner scan = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the air temperature (in degrees above absolute zero): ");
        airTemperature = scan.nextInt();

        System.out.print("Enter the steam temperature (in degrees above absolute zero): ");
        steamTemperature = scan.nextInt();
        
        if (steamTemperature < 373) 
        {
            efficiency = 0; 
        } 
        else 
        {
            efficiency = 1 - ((double) airTemperature / steamTemperature);
        }

        System.out.printf("The maximum possible efficiency of a steam engine is: %.2f%n", efficiency);

        scan.close();
    }
    
}
