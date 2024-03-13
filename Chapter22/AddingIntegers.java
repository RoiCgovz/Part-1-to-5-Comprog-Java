package Chapter22;
import java.util.Scanner;
public class AddingIntegers {
    public static void main(String[] args) 
    {
        int sumOfIntegers, inputNumber = 1,firstInput;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer (enter 0 to quit): ");
        firstInput = scanner.nextInt();

        if (firstInput == 0) {
            System.out.println("No integers were entered.");
            System.out.println("bye");
            return;
        }

        sumOfIntegers = firstInput;

        do {
            System.out.print("Enter an integer (or 0 to quit): ");
            inputNumber = scanner.nextInt();
            sumOfIntegers += inputNumber;
        } while (inputNumber != 0);

        System.out.println("Sum of the integers: " + sumOfIntegers);
        System.out.println("bye");
        scanner.close();
    }
}
