import java.util.Scanner;
public class Chap16Ex4 
{
    public static void main(String[] args) {
        
        int bodyweight;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Bodyweight in Pounds: ");
        bodyweight = scan.nextInt();
        scan.close();
        
        if (bodyweight >= 220 && bodyweight <=280)
        {
            System.out.println("You are eligible for the competition.");
        }
        else 
        {
            System.out.println("You are not eligible for the competition.");
        }

    }
}
