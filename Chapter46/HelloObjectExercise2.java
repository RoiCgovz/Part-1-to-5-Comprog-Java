import java.util.Scanner;

public class HelloObjectExercise2 {
    class HelloObject {
        private String morningGreeting;
        private String eveningGreeting;
        public HelloObject(String morningGreeting, String eveningGreeting) 
        {
            this.morningGreeting = morningGreeting;
            this.eveningGreeting = eveningGreeting;
        }
        public void speakMorning() 
        {
            System.out.println(morningGreeting);
        }
        public void speakEvening() 
        {
            System.out.println(eveningGreeting);
        }
    }
    public static void main(String[] args) 
    {
        
        HelloObjectExercise2 helloObject = new HelloObjectExercise2(); 
        HelloObject anObject = helloObject.new HelloObject("Good morning World!", "Good evening World!"); 
        
        anObject.speakMorning();
        anObject.speakEvening();
    }
}
