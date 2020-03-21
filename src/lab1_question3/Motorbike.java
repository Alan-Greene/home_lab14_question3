package lab1_question3;

public class Motorbike extends AbstractRental {
    public Motorbike(String rental_name, int renal_period){
        super(rental_name, renal_period);
    }

    @Override
    public double calculate_cost(){
        double cost_per_day = 0;

        if (this.getRental_period() > 10){
            cost_per_day = 25.50;
        } else {
            cost_per_day = 35.50;
        }
        return this.getRental_period() * cost_per_day;
    }
}
