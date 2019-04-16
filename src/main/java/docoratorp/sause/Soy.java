package docoratorp.sause;

import docoratorp.beverage.Beverage;

public class Soy extends CondimentDecorator {


    public Soy(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription()+", 豆浆";
    }


    public double cost() {
        return beverage.cost() + 0.11;
    }

}
