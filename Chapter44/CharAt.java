/*This Program asks the user enters a string, and the program 
  echos it to the monitor with one character per line.

    Name: Roilene Vhinz Fajardo
    Date: May 1, 2024
    Time: 8:23 PM

*/
import java.util.Scanner;
public class CharAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yourName;

        System.out.print("Enter Your Name: ");
        yourName = scan.nextLine().trim();
        
        for(int i = 0; i < yourName.length(); i++)
        {
            System.out.println(yourName.charAt(i));
        }
    }
}
