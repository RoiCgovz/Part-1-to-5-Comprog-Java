package Chapter35;
import java.util.Scanner;

public class InputFilePrompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName, name, extension;
        int dotIndex;

        do 
        {
            System.out.print("input file: ");
            fileName = scanner.nextLine();  

            if (fileName.equals(".dat")) 
            {
                System.out.println(">>>file name missing<<<");
                continue;
            }
            dotIndex = fileName.lastIndexOf('.');

            if (dotIndex == -1 || dotIndex == 0 || dotIndex == fileName.length() - 1)
            {
                System.out.println(">>>file name must end with .dat<<<");
                continue;   
            }
            name = fileName.substring(0, dotIndex);
            extension = fileName.substring(dotIndex + 1);

            if (name.contains(" ")) 
            {
                System.out.println(">>>file name must not contain spaces<<<");
                continue;
            }
            if (!extension.equals("dat")) 
            {
                System.out.println(">>>file extension must be .dat<<<");
                continue;       
            }
            break;

        } while (true);

        System.out.println("OK");
        scanner.close();
    }
}
