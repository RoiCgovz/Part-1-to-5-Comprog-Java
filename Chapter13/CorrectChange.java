package Chapter12;
import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {
        int inAmount,dol,qua,dim,nick,cents;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Change: ");
        inAmount = scan.nextInt();

        dol = inAmount /100;
        qua = inAmount % 100 / 25;
        dim = inAmount % 100 % 25 / 10;
        nick = inAmount % 100%  25 % 10 /5;
        cents =inAmount %100%25%10%5;
    
        System.out.print("Your Change is " + dol+" dollar/s\n");
        System.out.println(qua + " quarter/s");
        System.out.println(dim + " dime/s");
        System.out.println(nick + " nick/s");
        System.out.println(cents+ " cent/s");
        scan.close();
    }
}
