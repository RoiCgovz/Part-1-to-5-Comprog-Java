import java.util.Scanner;

public class YourAgeInSeconds 
{
    public static void main(String[] args) 
    {
        int yearsAlive, monthsAlive, daysAlive, totalDaysAlive;
        long ageSeconds;
        double percentageLived,expectedLifespanSeconds;
        Scanner scan = new Scanner(System.in);

        System.out.println("Years Alive: ");
        yearsAlive = scan.nextInt();
        System.out.println("Months Alive: ");
        monthsAlive = scan.nextInt();
        System.out.println("Days Alive: ");
        daysAlive = scan.nextInt();

        totalDaysAlive =  daysAlive + (yearsAlive * 365);

        if (monthsAlive == 1)
            totalDaysAlive += 31;
        if(monthsAlive  == 2)
            totalDaysAlive += 31 + 28;
        if(monthsAlive  == 3)
            totalDaysAlive += 31 + 28 + 31;
        if(monthsAlive  == 4)
            totalDaysAlive += 31 + 28 + 31 + 30;
        if(monthsAlive  == 5)
            totalDaysAlive += 31 + 28 + 31 + 30 + 31;
        if(monthsAlive  == 6)
            totalDaysAlive += 31 + 28 + 31 + 30 + 31 + 30;
        if(monthsAlive  == 7)
            totalDaysAlive += 31 + 28 + 31 +30 +31 +30 +31;
        if(monthsAlive  == 8)
            totalDaysAlive += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        if(monthsAlive  == 9)
            totalDaysAlive += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        if(monthsAlive  == 10)
            totalDaysAlive += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        if(monthsAlive  == 11)
            totalDaysAlive += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        if(monthsAlive  == 12)
            totalDaysAlive += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
        if (monthsAlive == 0)
            totalDaysAlive += 0;

        ageSeconds = (long) totalDaysAlive * 24 *60 *60;

        expectedLifespanSeconds = 2.5 * Math.pow(10, 9);
        percentageLived = (ageSeconds / expectedLifespanSeconds) * 100;

    
        System.out.print("Your age in seconds: "+ ageSeconds);
        System.out.print("\nLifespan Percentage Lived: " + percentageLived);
        scan.close();
    }

}
