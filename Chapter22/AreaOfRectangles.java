package Chapter22;
import java.util.Scanner;
public class AreaOfRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, x2,y1,y2, height, width,area;
        boolean isLooped = true;

        while (isLooped) 
        {
            System.out.println("\nFirst Corner X coordinate: ");
            x1 = scanner.nextInt();
            System.out.println("First Corner Y coordinate: ");
            y1 = scanner.nextInt();
            System.out.println("Second Corner X coordinate: ");
            x2 = scanner.nextInt();
            System.out.println("Second Corner Y coordinate: ");
            y2 = scanner.nextInt();

            height = Math.abs(y2 - y1);
            width = Math.abs(x2 - x1);
            area = height * width;

            System.out.print("Height: " + height + " Width: " + width + " Area: " + area + "\n");

            if (height == 0 || width == 0 || area == 0) 
            {
                System.out.print("\nfinished");
                isLooped = false;
            }
        }
        scanner.close();
    }
}
