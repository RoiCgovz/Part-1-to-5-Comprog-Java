package Chapter44;

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

        System.out.println(firstName + "" + lastName);
    }
    
}
