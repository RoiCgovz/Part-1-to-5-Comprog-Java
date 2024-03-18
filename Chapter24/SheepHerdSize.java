package Chapter24;
public class SheepHerdSize {
    public static void main(String[] args) {
   
        double power = 1, N;
        int supervisionYears = 0;

        for (int t = 0; t <= 25; t++) 
        {
            N = 220 / (1 + 10 * power);
            System.out.printf("After %d years, the population is %.2f\n", t, N);
            power *= 0.83; 
             
            if (N >= 80 && supervisionYears == 0) 
            {
                supervisionYears = t;
            }
        }
        System.out.println("The herd must be supervised for " + supervisionYears + " years.");
    }
}
