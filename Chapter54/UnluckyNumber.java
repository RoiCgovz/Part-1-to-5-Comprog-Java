import java.util.Scanner;

public class UnluckyNumber 
{
    public static boolean isUnlucky(long num) 
    {
        String numStr; 
        numStr = Long.toString(num);
        return numStr.contains("13");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num;

        System.out.println("Enter a nonnegative integer (enter a negative integer to end):");

        while (true) 
        {
            num = scanner.nextLong();
            if (num < 0) 
            {
                System.out.println("Exiting the program...");
                System.out.println("Program Exit Sucessfully.");
                break;
            }
            if (isUnlucky(num)) 
                System.out.println(num + " is unlucky.");
            else 
                System.out.println(num + " is safe.");
            System.out.println("Enter another nonnegative integer (enter a negative integer to end):");
        }
    }
}
