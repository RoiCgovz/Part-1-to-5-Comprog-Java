/*This Program a asks the user to enter the time as a sequence of digits and then displays 
  the time as "minutes:seconds" as above. Assume that if two or fewer digits are entered 
  that the digits represent seconds. In this case, display a zero before the colon. 
  If three or more digits are entered, the last two represent seconds.

    Name: Roilene Vhinz Fajardo
    Date: May 6, 2024
    Time: 7:14 PM

*/
import java.util.Scanner;
public class MicrowaveMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cookTime;

        System.out.print("Enter cook time--->  ");
        cookTime = scan.nextLine().trim();

        if (cookTime.length() == 1)
            System.out.print("Your time->   00:0"+cookTime.substring(0, 1));
        else if (cookTime.length() == 2)
            System.out.print("Your time->   00:" + cookTime.substring(0, 2));
        else if (cookTime.length() == 3)
            System.out.print("Your time->  0" + cookTime.substring(0, 1) +":"+ cookTime.substring(1,cookTime.length()));
        else if (cookTime.length() == 4)
            System.out.print("Your time->  " + cookTime.substring(0, 2) +":"+ cookTime.substring(2,cookTime.length()));

        
    }
}
