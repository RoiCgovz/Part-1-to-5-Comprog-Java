package Chapter17;

import java.util.Scanner;

public class FantasyGame 
{
    public static void main(String[] args) 
    {
        int strength, health, luck, totalPoints;
        String characterName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Yertle's Quest");
        System.out.print("Enter the name of your character: ");
        characterName = scanner.nextLine();

        System.out.print("Enter strength (1-10): ");
        strength = scanner.nextInt();

        System.out.print("Enter health (1-10): ");
        health = scanner.nextInt();

        System.out.print("Enter luck (1-10): ");
        luck = scanner.nextInt();

        totalPoints = strength + health + luck;
        if (totalPoints > 15) 
        {
            System.out.println("You have given your character too many points! Default values have been assigned.");
            strength = health = luck = 5; 
        }

        System.out.printf("%s, strength: %d, health: %d, luck: %d%n", characterName, strength, health, luck);

        scanner.close();
    }    
}
