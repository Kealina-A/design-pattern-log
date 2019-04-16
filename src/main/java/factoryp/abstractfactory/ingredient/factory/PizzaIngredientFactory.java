package factoryp.abstractfactory.ingredient.factory;

import factoryp.abstractfactory.ingredient.Cheese;
import factoryp.abstractfactory.ingredient.Clams;
import factoryp.abstractfactory.ingredient.Dough;
import factoryp.abstractfactory.ingredient.Sauce;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClam();
}
