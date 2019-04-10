package docorator;


public class Espresso extends Beverage {

    public Espresso() {
        super.description = "Espresso";
    }

    double cost() {
        return 1.6;
    }
}
