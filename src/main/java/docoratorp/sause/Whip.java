package docoratorp.sause;

import docoratorp.beverage.Beverage;

public class Whip extends CondimentDecorator {


    public Whip(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription()+", 奶泡";
    }


    public double cost() {
        return beverage.cost() + 0.34;
    }

}
