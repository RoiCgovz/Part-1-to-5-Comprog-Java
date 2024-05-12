import java.util.Scanner;

public class PerfectNumbers {
    
    public static boolean isPerfectNumber(int num) {
        int sumOfDivisors = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == num;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an upper limit: ");
        int upperLimit = scanner.nextInt();
        System.out.println("Perfect numbers less than " + upperLimit + " are:");
        for (int i = 2; i < upperLimit; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
