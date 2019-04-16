package factoryp.abstractfactory.pizza;

import factoryp.abstractfactory.ingredient.Cheese;
import factoryp.abstractfactory.ingredient.Clams;
import factoryp.abstractfactory.ingredient.Dough;
import factoryp.abstractfactory.ingredient.Sauce;

public abstract class Pizza {

    String name;
    Dough dough;
    Cheese cheese;
    Sauce sauce;
    Clams clams;


    public abstract void prepare();
    public void bake(){
        System.out.println("烘培...");
    }
    public void cut(){
        System.out.println("切片...");
    }
    public void box(){
        System.out.println("打包...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
