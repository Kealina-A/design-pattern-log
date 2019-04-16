package strategyp.quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("不会发声");
    }
}
