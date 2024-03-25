package Chapter34;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        int spaces = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                case ' ':
                    spaces++;
                    break;
                case '.':
                case ',':
                case ';':
                case ':':
                case '!':
                case '?':
                    punctuation++;
                    break;
                default:
                    if (Character.isLetter(ch)) {
                        consonants++;
                    }
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuation: " + punctuation);
        System.out.println("Spaces: " + spaces);
        
        scanner.close();
    }
}