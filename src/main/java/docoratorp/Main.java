package docoratorp;

import docoratorp.beverage.Beverage;
import docoratorp.beverage.HouseBlend;
import docoratorp.sause.Milk;
import docoratorp.sause.Mocha;
import docoratorp.sause.Soy;

public class Main {

    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend);
        houseBlend = new Milk(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);

        System.out.println(houseBlend.cost());
        System.out.println(houseBlend.getDescription());
    }
}
