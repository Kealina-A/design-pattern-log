package factoryp.abstractfactory.ingredient.factory;

import factoryp.abstractfactory.ingredient.Cheese;
import factoryp.abstractfactory.ingredient.Clams;
import factoryp.abstractfactory.ingredient.Dough;
import factoryp.abstractfactory.ingredient.Sauce;
import factoryp.abstractfactory.ingredient.impl.ClamImpl.FreshClams;
import factoryp.abstractfactory.ingredient.impl.DoughImpl.ThinCrustDough;
import factoryp.abstractfactory.ingredient.impl.SauceImpl.MarinaraSauce;
import factoryp.abstractfactory.ingredient.impl.cheeseImpl.MozzarellaCheese;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
