import java.util.Scanner;

public class YourAgeInSeconds {
    public static void main(String[] args) {
        int yearsAlive, monthsAlive, daysAlive, totalDaysAlive;
        long ageSeconds;
        double percentageLived, expectedLifespanSeconds;
        Scanner scan = new Scanner(System.in);

        System.out.println("Years Alive: ");
        yearsAlive = scan.nextInt();
        System.out.println("Months Alive: ");
        monthsAlive = scan.nextInt();
        System.out.println("Days Alive: ");
        daysAlive = scan.nextInt();

        totalDaysAlive = daysAlive + (yearsAlive * 365);
        if (monthsAlive >= 2) {
            totalDaysAlive += (monthsAlive - 1) / 12 * 31;
            totalDaysAlive += ((monthsAlive - 1) % 12 / 2) * 30;
            totalDaysAlive -= 2;
        } else {
            totalDaysAlive += (monthsAlive - 1) / 12 * 31;
            totalDaysAlive += ((monthsAlive - 1) % 12 / 2) * 30;
        }

        ageSeconds = (long) totalDaysAlive * 24 * 60 * 60;

        expectedLifespanSeconds = 2.5 * Math.pow(10, 9);
        percentageLived = (ageSeconds / expectedLifespanSeconds) * 100;

        System.out.print("Your age in seconds: " + ageSeconds);
        System.out.print("\nLifespan Percentage Lived: " + percentageLived);
        scan.close();
    }

}
