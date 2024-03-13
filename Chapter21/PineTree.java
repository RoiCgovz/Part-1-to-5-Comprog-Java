package Chapter21;

import java.util.Scanner;

public class PineTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the tree:");
        int treeHeight = scanner.nextInt();

        for (int i = 1; i <= treeHeight; i++) 
        {
            for (int j = 0; j < treeHeight - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < treeHeight - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
        scanner.close();
    }
    
}
