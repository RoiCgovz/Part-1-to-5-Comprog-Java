package Chapter24;

import java.util.Scanner;

public class MaximumOfIntegersInAFile 
{
    public static void main(String[] args) 
    {
        int max = 0, fileInput, sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int i =1; i<= 5;i++)
        {
            fileInput = scan.nextInt();
            if (fileInput > max){
                max = fileInput;
            }
            sum += fileInput;
        }
        System.out.println("Sum of integers is : " + sum);
        System.out.println("Maximum of integers: "+ max);
        scan.close();
    }
}

