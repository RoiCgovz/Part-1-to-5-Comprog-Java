package Chapter19;

import java.util.Scanner;

public class OneLetterperline 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String inputWord = scanner.nextLine();

        int length = inputWord.length();

        for (int i = 0; i < length; i++) 
        {
            System.out.println(inputWord.charAt(i));
        }
        scanner.close();
    }
}


