/*This Program reads in lines and outputs only those comment lines before /* and */ 
/* , and //. */
/*  
    Name: Roilene Vhinz Fajardo
    Date: May 6, 2024
    Time: 8:18 PM

*/

import java.util.Scanner;

public class BetterDocumentationPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean blockComment = false;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.trim().startsWith("/*")) {
                blockComment = true;
                System.out.println(line);
            } else if (line.trim().startsWith("//") || blockComment || line.trim().startsWith("*/")) {
                System.out.println(line);
            }
            if (line.trim().endsWith("*/")) {
                blockComment = false;
            }
        }
    }
}