package docoratorp.sause;


import docoratorp.beverage.Beverage;

public class Mocha extends CondimentDecorator {


    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription()+", 摩可";
    }


    public double cost() {
        return beverage.cost() + 0.1;
    }

}
