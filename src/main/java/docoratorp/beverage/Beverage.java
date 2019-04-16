package docoratorp.beverage;

/**
 * 饮料类
 */
public abstract class Beverage {
    String description = "unknown";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
