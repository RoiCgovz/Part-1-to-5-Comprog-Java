import java.util.Scanner;

public class OdiousEvilNumbers {

    public static boolean isOdious(long num) 
    {
        int count; 
        count = 0;
        while (num != 0) {
            if (num % 2 == 1) {
                count++;
            }
            num /= 2;
        }
        return count % 2 == 1;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        long num;
        System.out.println("Enter a nonnegative integer (enter a negative integer to end):");
        while (true) {
            num = scanner.nextLong();
            if (num < 0) 
            {
                System.out.println("Exiting the program...");
                System.out.println("Program Exit Sucessfully.");
                break;
            }
            if (isOdious(num)) 
                System.out.println(num + " is odious.");
            else 
                System.out.println(num + " is evil.");
            System.out.println("Enter another nonnegative integer (enter a negative integer to end):");
        }
    }
}
