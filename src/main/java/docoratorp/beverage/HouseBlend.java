package docoratorp.beverage;


public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.description = "HouseBlend";
    }

    public double cost() {
        return 1.1;
    }
}
