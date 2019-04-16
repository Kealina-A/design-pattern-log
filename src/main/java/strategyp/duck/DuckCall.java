package strategyp.duck;

import strategyp.fly.FlyBehavior;
import strategyp.fly.FlyNoWay;
import strategyp.quack.Quack;
import strategyp.quack.QuackBehavior;

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
