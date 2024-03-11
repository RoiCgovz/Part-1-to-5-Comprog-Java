import java.util.Scanner;

public class DiscountPrices 
{
    public static void main(String[] args) 
    {
        int purchase,purchases1, discounted;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of Purchases: ");
        purchase = scan.nextInt();
        scan.close();
        if (purchase > 10.0)
        {
            purchases1 = (int) (purchase * 0.1);
            discounted = purchase - purchases1; 
            System.out.printf("Discounted Price: %d" , discounted);
        }
        else
        {
            System.out.println("Item is not over $10.00");
        }
    }

}
