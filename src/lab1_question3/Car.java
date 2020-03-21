package lab1_question3;

public class Car extends AbstractRental {
    private boolean sports;

    public Car(String rental_name, int rental_period, boolean sports){
        super(rental_name, rental_period);
        this.sports = sports;
    }

     @Override
     public double calculate_cost(){
        double cost_per_day = 0;

        if (this.sports){
            cost_per_day = 75;
        } else {
            cost_per_day = 50;
        }
        return this.getRental_period() * cost_per_day;
     }
}
