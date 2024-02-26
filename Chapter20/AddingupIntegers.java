package Chapter20;

import java.util.Scanner;

public class AddingupIntegers 
{
      public static void main(String[] args) 
      {
        int numberOfIntegers, num, sum = 0; 
        Scanner scan = new Scanner(System.in);

        System.out.println("How many integers will be added:");
        numberOfIntegers = scan.nextInt();

        for (int i = 0; i < numberOfIntegers; i++) 
        {
            System.out.println("Enter an integer:");
            num = scan.nextInt();
            sum += num;
        }

        System.out.println("The sum is " + sum);
        scan.close();
    }
    
}
