import java.util.Scanner;

public class WindChillIndex {
    public static void main(String[] args) {
        double windSpeed,temp,windChill;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Wind Speed:");
        windSpeed = scan.nextDouble();

        System.out.println("Enter Temperature:");
        temp = scan.nextDouble();

        if (windSpeed < 3 && temp > 50) 
        {
            System.out.println("Wind Chill: current temperature");   
        } 
        else 
        {
            windChill = (35.74 + 0.6215 * temp) -(35.75 * Math.pow(windSpeed, 0.16)) + (0.4275*temp* Math.pow(windSpeed, 0.16));
            System.out.print("Wind Chill: "+ windChill);
        }
        scan.close();
    }
}
