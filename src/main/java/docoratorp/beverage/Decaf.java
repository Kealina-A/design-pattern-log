package docoratorp.beverage;


public class Decaf extends Beverage {

    public Decaf() {
        super.description = "Decaf";
    }

    public double cost() {
        return 1.8;
    }
}
