import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        int options;
        double quiz, labWorks, exam;
        double grade, roundedValue;
        boolean loop = false;
        Scanner scan = new Scanner(System.in);
        char choice;
        
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.println("\nOptions");
            System.out.println("[1] Compute Midterm Grade");
            System.out.println("[2] Compute Final Grade");
            System.out.println("[3] Quit");
            System.out.println("Press 1, 2, or 3: ");
            options = scan.nextInt();

            do {
            switch (options) 
            {
                case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("Enter Quiz Grade:   \t");
                quiz = scan.nextDouble();
                System.out.print("Enter Labworks Grade:   \t");
                labWorks = scan.nextDouble();
                System.out.print("Enter Midterm Exam Grade: ");
                exam = scan.nextDouble();

                    quiz *= 0.2;
                    labWorks *= 0.4;
                    exam *= 0.4;

                    grade =  exam + quiz + labWorks;
             
                    roundedValue = Math.floor(grade * 10) / 10.0;

                    System.out.println("Midterm Grade: " + roundedValue);
                    if (roundedValue >= 5 && roundedValue <= 5 &&roundedValue >= 0)
                        System.out.println("\u001B[31m"+ "You failed." + "\u001B[0m" );
                    else if (roundedValue <= 4.9
                     && roundedValue >= 1 && roundedValue >= 0) 
                        System.out.println("\u001B[32m"+"You passed." + "\u001B[0m");
                    else
                        System.out.println("Invalid grade.");
                    System.out.flush();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.print("Enter Quiz Grade: \t");
                    quiz = scan.nextDouble();
                    System.out.print("Enter Labworks Grade: \t");
                    labWorks = scan.nextDouble();
                    System.out.print("Enter Final Exam Grade: ");
                    exam = scan.nextDouble();

                    quiz *= 0.2;
                    labWorks *= 0.4;
                    exam *= 0.4;

                    grade =  exam + quiz + labWorks;
             
                    roundedValue = Math.floor(grade * 10) / 10.0;

                    System.out.println("Midterm Grade: \t\t" + roundedValue);
                    if (roundedValue == 5 && roundedValue <= 5 &&roundedValue >= 0 )
                        System.out.println("\u001B[31m"+ "You failed." + "\u001B[0m" );
                    else if (roundedValue <= 4.9 && roundedValue >= 1 && roundedValue >= 0) 
                        System.out.println("\u001B[32m"+"You passed." + "\u001B[0m");
                    else
                        System.out.println("Invalid grade.");
                    System.out.flush();
                    System.out.flush();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("The Program has successfully been stopped.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
            System.err.print("Do you want to input again? [Y/N]: ");
            choice = Character.toUpperCase(scan.next().charAt(0));

            if (choice == 'N') {
                System.out.print("\033[H\033[2J");
                System.out.println("The Program has successfully been stopped.");
                System.exit(0);
            } else if (choice != 'Y') {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
            System.out.print("\033[H\033[2J");
        } while (loop);
        }
        
    }
}
