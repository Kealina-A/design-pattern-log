package docorator;

public class Whip extends CondimentDecorator {


    public Whip(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription()+", 奶泡";
    }


    double cost() {
        return beverage.cost() + 0.34;
    }

}
