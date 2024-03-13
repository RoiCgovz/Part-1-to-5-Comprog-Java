package Chapter21;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctCount = 0, num1, num2, correctAnswer, userAnswer;

        for (int i = 0; i < 10; i++) {
            num1 = random.nextInt(10);
            num2 = random.nextInt(10);

            System.out.print("What is " + num1 + " * " + num2 + "? ");
            userAnswer = scanner.nextInt();

            correctAnswer = num1 * num2;
            if (userAnswer == correctAnswer) {
                System.out.println("Right!");
                correctCount++;
            } else {
                System.out.println("Wrong. " + num1 + " * " + num2 + " is " + correctAnswer);
            }
        }

        System.out.println("You got " + correctCount + " out of 10 questions correct!");
        scanner.close();
    }
}