package Chapter19;

import java.util.Scanner;

public class RunofIntegers {
    public static void main(String[] args) 
    {
        int start,end;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Start:");
        start = scan.nextInt();

        System.out.println("Enter End:");
        end = scan.nextInt();

        System.out.println("Integers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) 
        {
            System.out.println(i);
        }
        scan.close();
    }
    
}
