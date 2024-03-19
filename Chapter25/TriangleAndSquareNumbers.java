package Chapter25;

public class TriangleAndSquareNumbers {
    public static void main(String[] args) {
        int upperLimit = 1000; 
        for (int n = 1; n <= upperLimit; n++) 
        {
            boolean isSquare = false;
            boolean isTriangle = false;
            int sqrt = (int) Math.sqrt(n);
            if (sqrt * sqrt == n) 
            {
                isSquare = true;
            }
            int sum = 0;
            for (int i = 1; sum <= n; i++) 
            {
                sum += i;
                if (sum == n) 
                {
                    isTriangle = true;
                    break;
                }
            }
            if (isSquare && isTriangle) {
                System.out.println(n + " is both square and triangle.");
            }
        }
    }
}
