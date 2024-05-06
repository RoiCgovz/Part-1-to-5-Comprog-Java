/*This Program asks for user's name and then writes it back with 
  the first name as entered, and the last name all in capital letters. 

    Name: Roilene Vhinz Fajardo
    Date: May 1, 2024
    Time: 8:21 PM
    
*/
import java.util.Scanner;
public class NameEcho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, firstName,lastName;
        int spaceIndex;
        
        System.out.print("Enter your Name: ");
        name = scan.nextLine().trim();

        spaceIndex = name.indexOf(" "); 

        firstName = name.substring(0, spaceIndex);
        lastName = name.substring(spaceIndex + 1).toUpperCase();

        System.out.println(firstName + " " + lastName);
    }
    
}
