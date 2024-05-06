import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class WordTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word --> ");
        String word = scanner.nextLine();
        
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(word.substring(i, word.length() - i));
        }
    }
}
