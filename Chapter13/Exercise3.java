import java.util.Scanner;

public class Exercise3 {
    public static void main (String[] args)
    {
        double num, res;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter a Double:");
        num = scan.nextDouble();

        res = Math.log(num) / Math.log(2);

        System.out.print("Base 2 log of " + num + " is " + res);
    }
}
