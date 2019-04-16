package factoryp.abstractfactory.ingredient.factory;

import factoryp.abstractfactory.ingredient.Cheese;
import factoryp.abstractfactory.ingredient.Clams;
import factoryp.abstractfactory.ingredient.Dough;
import factoryp.abstractfactory.ingredient.Sauce;
import factoryp.abstractfactory.ingredient.impl.ClamImpl.FrozenClams;
import factoryp.abstractfactory.ingredient.impl.DoughImpl.TickCrustDough;
import factoryp.abstractfactory.ingredient.impl.SauceImpl.PlumTomatoSauce;
import factoryp.abstractfactory.ingredient.impl.cheeseImpl.ReggianoCheese;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new TickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
