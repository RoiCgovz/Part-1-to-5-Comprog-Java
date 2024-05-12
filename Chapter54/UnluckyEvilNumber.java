import java.util.Scanner;

public class UnluckyEvilNumber {

    public static boolean isUnlucky(long num) {
        String numStr;
        numStr = Long.toString(num);
        return numStr.contains("13");
    }

    public static boolean isEvil(long num) {
        int count; 
        count = 0;
        while (num != 0) {
            if (num % 2 == 1) {
                count++;
            }
            num /= 2;
        }
        return count % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLimit;
        boolean foundUnluckyEvil = false;

        System.out.print("Enter the upper limit: ");
        upperLimit = scanner.nextInt();

        for (int i = 1; i <= upperLimit; i++) {
            if (isUnlucky(i) && isEvil(i)) {
                System.out.println("Unlucky and Evil number found: " + i);
                foundUnluckyEvil = true;
            }
        }

        if (!foundUnluckyEvil) {
            System.out.println("No unlucky and evil numbers found in the range up to " + upperLimit);
        }
    }
}
