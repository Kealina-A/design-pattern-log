package docorator;


public class DarkRoast extends Beverage {

    public void main(String[] args) {
        super.description = "DarkRoast";
    }

    double cost() {
        return 1.2;
    }
}
