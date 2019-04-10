package docorator;

/**
 * 饮料类
 */
public abstract class Beverage {
    String description = "unknown";

    public String getDescription() {
        return description;
    }

    abstract double cost();
}
