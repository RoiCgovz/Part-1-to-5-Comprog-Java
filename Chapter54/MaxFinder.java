import java.util.Scanner;

public class MaxFinder {
    public static int maxEight(int A, int B, int C, int D, int E, int F, int G, int H) {
        int max = A; 
        if (B > max) 
            max = B;
        if (C > max) 
            max = C;
        if (D > max) 
            max = D;
        if (E > max) 
            max = E;
        if (F > max) 
            max = F;
        if (G > max) 
            max = G;
        if (H > max) 
            max = H;
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter eight integers
        System.out.println("Enter eight integers separated by spaces:");

        // Read eight integers
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();
        int G = scanner.nextInt();
        int H = scanner.nextInt();

        // Find and print the maximum using maxEight method
        int max = maxEight(A, B, C, D, E, F, G, H);
        System.out.println("The maximum of the eight integers is: " + max);

        scanner.close();
    }
}
