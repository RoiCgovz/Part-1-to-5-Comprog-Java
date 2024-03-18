package Chapter23;

public class DrugPotency {
    public static void main(String[] args) {
        double effectiveness = 100.0; 
        int months = 0;
        while (effectiveness >= 50.0) {
            System.out.println("months: " + months + "\t effectiveness: " + effectiveness);   
            effectiveness *= 0.96; 
            months++;
        }
        System.out.println("months: " + months + "\t effectiveness: " + effectiveness + "\t DISCARDED"); 
    }
    
}
