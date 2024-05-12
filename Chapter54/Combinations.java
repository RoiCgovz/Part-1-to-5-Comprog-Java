public class Combinations {

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

    public static long combinations(int n, int r) {
        long numerator = factorial(n);
        long denominator = factorial(r) * factorial(n - r);
        if (numerator == -1 || denominator == -1) {
            return -1; 
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        n = scanner.nextInt();
        System.out.print("Enter R: ");
        r = scanner.nextInt();

        long result = combinations(n, r);
        if (result == -1) {
            System.out.println("Error: Factorial overflow or invalid input.");
        } else {
            System.out.println("Number of combinations (N choose R): " + result);
        }
    }
}
