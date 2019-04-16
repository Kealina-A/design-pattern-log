package factoryp.abstractfactory.store;

import factoryp.abstractfactory.pizza.Pizza;

public abstract class PizzaStore {

    Pizza pizza;

    public void orderPizza(String type) {
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }

    abstract Pizza createPizza(String type);
}
