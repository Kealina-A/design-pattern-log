package factoryp.abstractfactory.store;


import factoryp.abstractfactory.ingredient.factory.NYPizzaIngredientFactory;
import factoryp.abstractfactory.ingredient.factory.PizzaIngredientFactory;
import factoryp.abstractfactory.pizza.CheesePizza;
import factoryp.abstractfactory.pizza.ClamPizza;
import factoryp.abstractfactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("纽约芝士风味披萨");
        }else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("纽约新鲜蛤风味披萨");
        }
        return pizza;
    }
}
