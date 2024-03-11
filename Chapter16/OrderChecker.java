import java.util.Scanner;
public class OrderChecker
{
    public static void main(String[] args)
    {
        int bolts, nuts, washers, totalCost;
        final int boltPrice = 5 , nutPrice = 3, washerPrice = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of bolts: ");
        bolts = scanner.nextInt();

        System.out.print("Number of nuts: ");
        nuts = scanner.nextInt();

        System.out.print("Number of washers: ");
        washers = scanner.nextInt();
        
        
        totalCost = (bolts * boltPrice) + (nuts * nutPrice) + (washers * washerPrice);
    
        if (nuts >= bolts && washers >= (2 * bolts)) 
        {
            System.out.println("\nOrder is OK.");
        } 
        else  
        {
            System.out.print("\nChecking the Order: ");

            if(nuts < bolts)
            {
                System.out.print("too few nuts");
            }
            if (washers < (2* bolts))
            {
                System.out.print("\n\t\t    too few washers");
            }
        }

        System.out.print("\n\nTotal cost: " + totalCost);

        scanner.close();
    }
}


