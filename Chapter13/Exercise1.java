import java.util.Scanner;

public class Exercise1
{
  public static void main (String[] args)
  {
    double kilowattCents, res;
    int kilowattYear;
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter cost per kilowatt-hour in cents");
    kilowattCents = scan.nextDouble();
    System.out.println("Enter kilowatt-hours used per year");
    kilowattYear = scan.nextInt();
    
    res = (double) (kilowattYear * kilowattCents) / 100;
    
    System.out.print("Annual cost: " + res);

    
  }
}