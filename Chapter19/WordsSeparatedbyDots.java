package Chapter19;

import java.util.Scanner;

public class WordsSeparatedbyDots {
    public static void main(String[] args) 
    {
        String firstWord,secondWord;
        int totalLength = 30,dotsCount;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        firstWord = scanner.nextLine();

        System.out.println("Enter second word:");
        secondWord = scanner.nextLine();

        dotsCount = totalLength - (firstWord.length() + secondWord.length());

        System.out.print(firstWord);

        for (int i = 0; i < dotsCount; i++) 
        {
            System.out.print(".");
        }

        System.out.println(secondWord);
        scanner.close();
    }
}
