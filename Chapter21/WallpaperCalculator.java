package Chapter21;

import java.util.Scanner;
  
public class WallpaperCalculator {
    public static void main(String[] args) 
    {
        double width, length, height,totalArea,  totalOpeningArea = 0;
        double openingHeight, openingWidth, areaToCover, rollAreaToInches,numRolls;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the room:");
        System.out.print("Width (in inches): ");
        width = scanner.nextDouble();
        System.out.print("Height (in inches): ");
        height = scanner.nextDouble();
        System.out.print("Length (in inches): ");
        length = scanner.nextDouble();

        totalArea = 2 * (height * width + height * length);

        System.out.print("Enter the number of openings (windows, doors, etc.): ");
        int numOpenings = scanner.nextInt();

        for (int i = 1; i <= numOpenings; i++) {
            System.out.println("Enter the dimensions of opening " + i + ":");
            System.out.print("Width (in inches): ");
            openingWidth = scanner.nextDouble();
            System.out.print("Height (in inches): ");
            openingHeight = scanner.nextDouble();

            totalOpeningArea += openingWidth * openingHeight;
        }
        areaToCover = totalArea - totalOpeningArea;
        rollAreaToInches = 27 * 4.5 * 36;
        numRolls = Math.ceil(areaToCover / rollAreaToInches);

        System.out.println("You will need " + (int) numRolls + " rolls of wallpaper.");
        scanner.close();
    }
}
