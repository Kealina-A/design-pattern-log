package factoryp.abstractfactory;

import factoryp.abstractfactory.store.NYPizzaStore;

public class Main {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        System.out.println();
        nyPizzaStore.orderPizza("clam");
    }
}
