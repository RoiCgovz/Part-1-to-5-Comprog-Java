import java.util.Scanner;

public class Y2KProblemDetector 
{
    public static void main(String[] args) {
        int currentYear, birthYear, age;
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Year of Birth: ");
        birthYear = scan.nextInt();

        System.out.print("Current Year: ");
        currentYear = scan.nextInt();

        if (currentYear <= birthYear) 
        {
           currentYear = currentYear + 100;
           age = currentYear - birthYear;
           System.out.print("Your age: " + age); 
        } 
        else 
        {
            age = currentYear - birthYear;
            System.out.print("Your age: " + age);
        }
            
        scan.close();
    }
    
}
