import java.util.Scanner;
public class Chap16Ex5 
{
    public static void main(String[] args) 
    {
      double pricePerPoundA, pricePerPoundB, percentLeanA, percentLeanB, costPerPoundLeanA, costPerPoundLeanB;
      Scanner scan = new Scanner(System.in);

      System.out.println("Price per pound package A: ");
      pricePerPoundA = scan.nextDouble();
    
      System.out.println("Percent lean pacakge A: ");
      percentLeanA = scan.nextDouble();

      System.out.println("Price per pound package B: ");
      pricePerPoundB = scan.nextDouble();

      System.out.println("Percent lean pacakge A: ");
      percentLeanB = scan.nextDouble();
      scan.close();

      costPerPoundLeanA = pricePerPoundA / ( percentLeanA /100 );
      costPerPoundLeanB = pricePerPoundB / ( percentLeanB /100 );

      System.out.printf("Package A cost per pound of lean: %.2f", costPerPoundLeanA );
      System.out.printf("\nPackage B cost per pound of lean: %.2f", costPerPoundLeanB);

      if (costPerPoundLeanA < costPerPoundLeanB)
      {
        System.out.println("\nPackage A has the best value.");
      }
      else
      {
        System.out.println("\nPackage B has the best value.");
      }
      
    }
}
