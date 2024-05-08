
import java.util.Scanner;
public class WordTriangle {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String word;
       int wordLength;
       System.out.print("Enter a word--> ");
       word = scan.nextLine();
       
       if (word.length() % 2 == 1)
        wordLength = word.length() / 2 + 1;
       else 
       wordLength = word.length() / 2;

       for (int i = 0; i < wordLength; i++)
        {
            for (int j= 0; j < i; j++)
            {
                System.out.print(" ");
            }
            System.out.println(word.substring(i , word.length()- i));
        }
    }
    
}
