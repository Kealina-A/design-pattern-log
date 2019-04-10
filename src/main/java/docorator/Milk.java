package docorator;

public class Milk extends CondimentDecorator {


    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription()+", 牛奶";
    }


    double cost() {
        return beverage.cost() + 0.3;
    }

}
