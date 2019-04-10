package docorator;

public class Mocha extends CondimentDecorator {


    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription()+", 摩可";
    }


    double cost() {
        return beverage.cost() + 0.1;
    }

}
