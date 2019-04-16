package docoratorp.beverage;


public class DarkRoast extends Beverage {

    public void main(String[] args) {
        super.description = "DarkRoast";
    }

    public double cost() {
        return 1.2;
    }
}
