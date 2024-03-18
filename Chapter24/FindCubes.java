package Chapter24;

import java.util.Scanner;

public class FindCubes {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int LIMIT,count = 0;
        double cubeRoot, remainder,sqrt;
        
        System.out.print("Enter upper limit --> ");
        LIMIT = scanner.nextInt();
        scanner.close();
    
        for (int N = 1; N <= LIMIT; N++) 
        {
            cubeRoot = Math.cbrt(N);
            if (cubeRoot == (int)cubeRoot) 
            {
                System.out.println(N + " is a cube: " + (int)cubeRoot + "^3");
                count = 0;
                for (int i = 1; i <= Math.sqrt(N); i++) 
                {
                    remainder = N - i * i;
                    sqrt = Math.sqrt(remainder);
                    if (sqrt == (int)sqrt) 
                    {
                        count++;
                        int j = (int) sqrt;
                        System.out.println(N + " is the sum of 2 squares");
                        System.out.println(N + " == " + i + "*" + i + " + " + j + "*" + j);
                    }
                }
                if (count == 0) 
                {
                    System.out.println(N + " is not the sum of 2 squares");
                }
            }
        }
    }
}
