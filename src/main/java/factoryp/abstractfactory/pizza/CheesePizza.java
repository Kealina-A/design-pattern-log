package factoryp.abstractfactory.pizza;

import factoryp.abstractfactory.ingredient.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory ;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("开始准备"+getName());
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        clams = pizzaIngredientFactory.createClam();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
