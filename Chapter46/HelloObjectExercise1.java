public class HelloObjectExercise1 {
    class HelloObject 
    {
        private String greeting; 
        public HelloObject(String greeting) 
        {
            this.greeting = greeting;
        }
        public void speak() {
            for (int i = 0; i < greeting.length(); i++) 
            {
                System.out.println(greeting);
            }
        }
    }
    public static void main(String[] args) 
    {
        HelloObjectExercise1 helloObject = new HelloObjectExercise1(); 
        HelloObject anObject = helloObject.new HelloObject("Hello");

        anObject.speak();
    }
}
