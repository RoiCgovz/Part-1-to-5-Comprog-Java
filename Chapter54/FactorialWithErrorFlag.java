public class FactorialWithErrorFlag {

    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            return -1; 
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
                if (result < 0) 
                    return -1;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int n = 21; // Test with n = 21 (overflow)
        long result = factorial(n);
        if (result == -1) {
            System.out.println("Error: Factorial overflow or invalid input.");
        } else {
            System.out.println("Factorial of " + n + " is: " + result);
            if (result < 0) {
                System.out.println("Warning: Result is negative.");
            }
        }
    }
}
