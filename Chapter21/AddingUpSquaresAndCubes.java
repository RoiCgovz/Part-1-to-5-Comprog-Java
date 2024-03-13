package Chapter21;
import java.util.Scanner;
public class AddingUpSquaresAndCubes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, sumSquares = 0, sumCubes = 0;
        System.out.print("Upper Limit: ");
        input = scan.nextInt();

        for (int i =1; i <=input; i++)
        {
            sumSquares += i * i;
            sumCubes += i * i * i;
        }
        System.out.print("The sum of Squares is "+ sumSquares);
        System.out.print("\nThe sum of Cubes is " + sumCubes);
        scan.close();
    }
}
