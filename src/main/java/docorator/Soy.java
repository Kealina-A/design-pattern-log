package docorator;

public class Soy extends CondimentDecorator {


    public Soy(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription()+", 豆浆";
    }


    double cost() {
        return beverage.cost() + 0.11;
    }

}
