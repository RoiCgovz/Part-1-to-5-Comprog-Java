package Chapter19;

import java.util.Scanner;

public class RepeatedlyEchoaWord {
     public static void main(String[] args) 
     {
        String inputString;
        int times;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        inputString = scan.nextLine();

        times = inputString.length();

        for (int i = 0; i < times; i++) 
        {
            System.out.println(inputString);
        }
        scan.close();
    }
}
