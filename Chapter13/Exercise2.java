import java.util.Scanner;

public class Exercise2
{
  public static void main(String[] args)
  {
    double d, g = 32.174 ,t;
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter number of seconds: ");
    t = scan.nextDouble();

    d = 0.5 * g * (Math.pow(t, 2f));

    System.out.print("Distance: " + d);
  }
}