package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.fly.FlyNoWay;
import strategy.quack.Quack;
import strategy.quack.QuackBehavior;

/**
 * 鸭鸣器，模拟鸭子的叫声，引诱野鸭
 * 不会飞
 * 会叫，发出呱呱呱的声音
 */
public class DuckCall extends Duck{

    public void display() {
        System.out.println("我是鸭鸣器");
    }

    public static void main(String[] args) {
        DuckCall duckCall = new DuckCall();
        QuackBehavior quack = new Quack();
        FlyBehavior flyBehavior = new FlyNoWay();

        duckCall.setQuackBehavior(quack);
        duckCall.setFlyBehavior(flyBehavior);

        duckCall.display();
        duckCall.performFly();
        duckCall.performQuack();
    }
}
