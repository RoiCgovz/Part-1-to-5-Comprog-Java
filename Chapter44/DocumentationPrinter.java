/*This Program reads in lines and outputs only those lines that start with //.
  When a Java source file is used as input the program will echo lines that describe the program.
  
    Name: Roilene Vhinz Fajardo
    Date: May 6, 2024
    Time: 7:52 PM

*/
import java.util.Scanner;

public class DocumentationPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        while (scanner.hasNextLine()) 
        {
            String line = scanner.nextLine();
            if (line.startsWith("//")) 
            {
                System.out.println(line);
            }
        }
    }
}
