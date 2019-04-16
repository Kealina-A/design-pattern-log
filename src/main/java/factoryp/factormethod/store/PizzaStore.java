package factoryp.factormethod.store;

import factoryp.factormethod.pizza.Pizza;

public abstract class PizzaStore {

    Pizza pizza;

    public void orderPizza(String type) {
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }

    abstract public Pizza createPizza(String type);
}
