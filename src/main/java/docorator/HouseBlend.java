package docorator;


public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.description = "HouseBlend";
    }

    double cost() {
        return 1.1;
    }
}
