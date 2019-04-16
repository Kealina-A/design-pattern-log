package factoryp.factormethod.store;

import factoryp.factormethod.pizza.DefaultPizza;
import factoryp.factormethod.pizza.NYStyleCheesePizza;
import factoryp.factormethod.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        }
        return new DefaultPizza();
    }

}
