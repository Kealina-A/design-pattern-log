package strategyp.duck;

import strategyp.fly.FlyNoWay;
import strategyp.fly.FlyRocketPowered;
import strategyp.quack.Squeak;

/**
 * 模型鸭
 * 不会飞
 * 会叫，发出吱吱吱的声音
 */
public class ModelDuck extends Duck {


    public ModelDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.performFly();
        //运行时修改可用使用setter方式
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
        duck.performQuack();
    }

    public void display() {
        System.out.println("我是模型塑胶大黄鸭");
    }
}
