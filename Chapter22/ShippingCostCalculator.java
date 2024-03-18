package Chapter22;
import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        int weight;
        double shipping = 0;
        boolean isLooped = true;
        Scanner scan = new Scanner(System.in);

        while (isLooped) 
        {
            System.out.println("\nWeight of Order:");
            weight = scan.nextInt();

            if (weight == 0) 
            {
               System.out.println("bye");
               isLooped = false;
            } 
            else if (weight <= 10) 
                shipping = 3.00;
            else if (weight > 10) 
                shipping = 3.00 + (weight - 10) * 0.25;
            if (isLooped)
                System.out.printf("Shipping Cost: $%.2f\n", shipping);
        }
        scan.close(); 
    }
}
