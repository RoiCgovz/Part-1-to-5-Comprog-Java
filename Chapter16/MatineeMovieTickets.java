import java.util.Scanner;

public class MatineeMovieTickets 
{
    public static void main(String[] args) 
    {
        int age, time;
        double ticketPrice;
        Scanner scan = new Scanner(System.in);
    
            
        System.out.print("Enter your age: ");
        age = scan.nextInt();
    
        System.out.print("Enter the time on a 24-hour clock (e.g., 1200 for noon): ");
        time = scan.nextInt();
    
    
        if (age <= 0 || time < 0 || time > 2359) 
            System.out.println("Invalid input. Please enter valid age and time.");
            

        if (age > 13) 
        {  
            if (time < 1700) 
                ticketPrice = 5.00;
            else 
                ticketPrice = 8.00;
        }
        else
        { 
            if (time < 1700) 
                ticketPrice = 2.00;
            else 
                ticketPrice = 4.00; 
        }
            System.out.printf("The ticket price is $%.2f%n", ticketPrice);
            scan.close();
    }
}

