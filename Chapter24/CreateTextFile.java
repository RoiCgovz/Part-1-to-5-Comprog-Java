package Chapter24;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateTextFile {
    public static void main(String[] args) throws IOException 
    {
        String fileName = "Inputtextfile.txt";

        File file = new File(fileName);

        FileWriter writer = new FileWriter(file);

        Scanner scanner = new Scanner(System.in);

        try 
        {
            System.out.println("Please input 5 numbers (separated by spaces):");
            String input = scanner.nextLine();
            writer.write(input);
        } 
        finally
        {
            writer.close();
            scanner.close();
        }
        System.out.println("File '" + fileName + "' created successfully with input numbers.");
    }

}
