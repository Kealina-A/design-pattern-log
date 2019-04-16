package commandp.entity;

public class Fan {

    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MIDDLE = 2;
    public static final int HIGH = 3;

    private int speed;//存储上一次的速度

    public int getSpeed() {
        return speed;
    }

    public void high() {
        System.out.println("风扇开到高档");
        speed = HIGH;
    }

    public void middle() {
        System.out.println("风扇开到中档");
        speed = MIDDLE;
    }

    public void low() {
        System.out.println("风扇开到低档");
        speed = LOW;
    }

    public void off() {
        System.out.println("关闭风扇");
        speed = OFF;
    }
}
