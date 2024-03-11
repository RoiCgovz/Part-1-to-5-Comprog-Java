import java.util.Scanner;

public class LastChanceGas 
{
    public static void main(String[] args) 
    {
        int tankCapacity, gasGauge, milesPerGallon;
        int remainingMiles;

        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Tank capacity: ");
        tankCapacity = scanner.nextInt();

        System.out.println("Gage reading: ");
        gasGauge = scanner.nextInt();

        System.out.print("Miles per gallon: ");
        milesPerGallon = scanner.nextInt();

        remainingMiles = (int) (tankCapacity * (gasGauge / 100.0)) * milesPerGallon;

        if (remainingMiles >= 200) 
        {
            System.out.println("Safe to Proceed");
        } else 
        {
            System.out.println("Get Gas!");
        }
        scanner.close();
    }


}
