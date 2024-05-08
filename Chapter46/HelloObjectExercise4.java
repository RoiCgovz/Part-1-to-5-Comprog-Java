public class HelloObjectExercise4 
{
    private String greeting;

    public HelloObjectExercise4(String greeting) 
    {
        this.greeting = greeting;
    }
    public HelloObjectExercise4(HelloObjectExercise4 init) 
    {
       
        this.greeting = new String(init.greeting);
    }
    public void speak() {
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        HelloObjectExercise4 original = new HelloObjectExercise4("Hello World!");
        HelloObjectExercise4 copy = new HelloObjectExercise4(original);
        copy.speak();
    }
}
