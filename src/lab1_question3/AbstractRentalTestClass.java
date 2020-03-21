package lab1_question3;

public class AbstractRentalTestClass {

    public static void main(String[] args) {
        Car car1 = new Car("John Murphy", 10, true);
        Car car2 = new Car("Molly Malone", 5, false);
        Motorbike bike1 = new Motorbike("Joe Bloggs", 20);
        Motorbike bike2 = new Motorbike("Jane Doe", 4);

        car1.print();
        car2.print();
        bike1.print();
        bike2.print();
    }
}
