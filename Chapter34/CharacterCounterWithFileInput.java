package Chapter34;
import java.util.Scanner;

public class CharacterCounterWithFileInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vowels = 0, consonants = 0, punctuation = 0, spaces = 0, totalVowels = 0, totalConsonants = 0, totalPunctuation = 0, totalSpaces = 0, totalCharacters = 0, totalNonSpaces;
        double vowelPercentage, consonantPercentage, punctuationPercentage,spacePercentage;

        while (true) {
            System.out.print("Enter a line of text (or type 'exit' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
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

            totalVowels += vowels;
            totalConsonants += consonants;
            totalPunctuation += punctuation;
            totalSpaces += spaces;
            totalCharacters += input.length();
        }

        System.out.println("\nTotal Vowels: " + totalVowels);
        System.out.println("Total Consonants: " + totalConsonants);
        System.out.println("Total Punctuation: " + totalPunctuation);
        System.out.println("Total Spaces: " + totalSpaces);
        System.out.println("Total Characters: " + totalCharacters);

        totalNonSpaces = totalCharacters - totalSpaces;
        vowelPercentage = (double) totalVowels / totalNonSpaces * 100;
        consonantPercentage = (double) totalConsonants / totalNonSpaces * 100;
        punctuationPercentage = (double) totalPunctuation / totalNonSpaces * 100;
        spacePercentage = (double) totalSpaces / totalCharacters * 100;

        System.out.println("\nPercentage of Vowels: " + vowelPercentage + "%");
        System.out.println("Percentage of Consonants: " + consonantPercentage + "%");
        System.out.println("Percentage of Punctuation: " + punctuationPercentage + "%");
        System.out.println("Percentage of Spaces: " + spacePercentage + "%");
        scanner.close();
    }
}

