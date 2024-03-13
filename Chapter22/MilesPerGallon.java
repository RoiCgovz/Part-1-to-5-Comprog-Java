package Chapter22;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        int iniMiles,finMiles,gallons;
        double milesPerGallon;
        Scanner scan = new Scanner(System.in);

        do 
        {
            System.out.println("\nInitial Miles (enter a negative number to quit): ");
            iniMiles = scan.nextInt();

            if (iniMiles < 0)
            {
                System.out.print("bye");
                return;
            }
            System.out.println("Final miles: ");
            finMiles = scan.nextInt();
            System.out.println("Gallons: ");
            gallons = scan.nextInt();

            milesPerGallon = (double) (finMiles - iniMiles) / gallons;
            System.out.print("Miles per Gallon: " + milesPerGallon);


        } 
        while (iniMiles >= 0);
    }
    
}
