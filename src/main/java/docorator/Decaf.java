package docorator;


public class Decaf extends Beverage {

    public Decaf() {
        super.description = "Decaf";
    }

    double cost() {
        return 1.8;
    }
}
