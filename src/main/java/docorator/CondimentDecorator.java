package docorator;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    //此处的description方法主要是为了让配料必须实现，主要是为了把各种描述拼接起来。如果没有此抽象方法，那么因为配料类可实现可不实现
    public abstract String getDescription() ;
}
