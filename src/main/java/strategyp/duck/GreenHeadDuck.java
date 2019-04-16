package strategyp.duck;

import strategyp.fly.FlyWithWings;
import strategyp.quack.Quack;

/**
 * 绿头鸭
 * 会飞
 * 会叫，发出是呱呱呱的声音
 */
public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        quackBehavior= new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("我是绿头鸭");
    }

    public static void main(String[] args) {
        Duck mallardDuck = new GreenHeadDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }

}
