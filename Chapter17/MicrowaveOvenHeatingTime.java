package Chapter17;
import java.util.Scanner;

public class MicrowaveOvenHeatingTime {
    public static void main(String[] args) 
    {
        int numberOfItems, singleItemTime, totalSeconds, recommendedSeconds, recommendedMinutes, remainingSeconds;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many items to heat: ");
        numberOfItems = scan.nextInt();

        System.out.print("Time for one item: ");
        singleItemTime = scan.nextInt();

        totalSeconds = singleItemTime % 100 + (singleItemTime / 100) * 60;

        if (numberOfItems == 1) 
        {
            recommendedSeconds = totalSeconds;
        } 
        else if (numberOfItems == 2) 
        {
            recommendedSeconds = (int) (totalSeconds * 1.5);
        } 
        else if (numberOfItems == 3) 
        {
            recommendedSeconds = totalSeconds * 2;
        } 
        else 
        {
            System.out.println("Heating more than three items is not recommended.");
            scan.close();
            return;
        }

        recommendedMinutes = recommendedSeconds / 60;
        remainingSeconds = recommendedSeconds % 60;

        System.out.printf("Heat for %d minutes %d seconds%n", recommendedMinutes, remainingSeconds);

        scan.close();
    }
    
}
