/*This Program asks for the user's name and then writes that name 
  to the monitor with either "Ms." or "Mr." in front, depending if the name is for a female or male.

    Name: Roilene Vhinz Fajardo
    Date: May 1, 2024
    Time: 8:35 PM

*/
import java.util.Scanner;

public class TitleApplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullName;

        while (true) {
            System.out.println("Enter a name:");
            fullName = scan.nextLine();

            if (fullName.isEmpty()) {
                break;
            }
            if (fullName.startsWith("Amy") || fullName.startsWith("Buffy") || fullName.startsWith("Cathy")) {
                System.out.println("Ms. " + fullName);
            } else if (fullName.startsWith("Elroy") || fullName.startsWith("Fred") || fullName.startsWith("Graham")) {
                System.out.println("Mr. " + fullName);
            } else {
                System.out.println(fullName);
            }
        }
    }
}
