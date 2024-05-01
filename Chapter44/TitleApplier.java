package Chapter44;

import java.util.Scanner;

public class TitleApplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullName;

        while (true) {
            System.out.println("Enter a name:");
            fullName = scan.nextLine();

            if (fullName.isEmpty()) {
                break;
            }
            if (fullName.startsWith("Amy") || fullName.startsWith("Buffy") || fullName.startsWith("Cathy")) {
                System.out.println("Ms. " + fullName);
            } else if (fullName.startsWith("Elroy") || fullName.startsWith("Fred") || fullName.startsWith("Graham")) {
                System.out.println("Mr. " + fullName);
            } else {
                System.out.println(fullName);
            }
        }
    }
}
