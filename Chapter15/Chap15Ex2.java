import java.util.Scanner;

public class Chap15Ex2 
{
    public static void main(String[] args) 
    {
        double angle, sin1, sin2, cos1, cos2;
        double angleToRadians;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input an angle: ");
        angle = scan.nextDouble();
        scan.close();

        angleToRadians = Math.toRadians(angle);
        sin1 = Math.sin(angleToRadians);
        sin2 = Math.pow(sin1, 2);
        cos1 = Math.cos(angleToRadians);
        cos2 = Math.pow(cos1, 2);

        System.out.printf("sin (%.2f)   is : %.2f", angle, sin1);
        System.out.printf("\nsin (%.2f)^2 is : %.2f", angle, sin2);
    }
}
