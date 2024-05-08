import java.util.Scanner;
class HelloObject 
{
    private String greeting;
    public HelloObject(String greeting) {
        this.greeting = greeting;
    }
    public void speak() {
        System.out.println("\n" + greeting);
    }
}
public class HelloObjectExercise3 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Greeting:");
        String userGreeting = scanner.nextLine();
        HelloObject hello = new HelloObject(userGreeting);
        hello.speak();
    }
}
