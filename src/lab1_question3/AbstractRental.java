package lab1_question3;

public abstract class AbstractRental {
    private String rental_name;
    private int rental_period;

    public AbstractRental(String rental_name, int rental_period){
        this.rental_name = rental_name;
        this.rental_period = rental_period;
    }

    public int getRental_period() {
        return rental_period;
    }

    abstract double calculate_cost();

    public void print(){
        System.out.printf("%s has a rental period of %d days at a cost of €%.2f%n", this.rental_name, this.getRental_period(), this.calculate_cost());
    }
}
