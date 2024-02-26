package Chapter17;

import java.util.Scanner;

public class InternetDelicatessen 
{
    public static void main(String[] args) 
    {
        int expressDelivery;
        String item;
        double price, deliveryCharge, totalCost;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the item: ");
        item = scan.nextLine();

        System.out.print("Enter the price: ");
        price = scan.nextDouble();

        System.out.print("Overnight delivery (0==no, 1==yes): ");
        expressDelivery = scan.nextInt();

        if (price < 10.0) 
        {
            deliveryCharge = 2.0; 
        } 
        else 
        {
            deliveryCharge = 0; 
        }
        if (expressDelivery == 1) 
        {
            deliveryCharge += 3.0; 
        }
        totalCost = price + deliveryCharge;

        System.out.println("\nInvoice:");
        System.out.printf("  %s    %.2f\n", item, price);
        System.out.printf("  delivery      %.2f\n", deliveryCharge);
        System.out.printf("  total         %.2f\n", totalCost);
        scan.close();
    }
}
