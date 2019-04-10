package docorator;

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
