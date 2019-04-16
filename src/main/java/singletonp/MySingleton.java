package singletonp;

/**
 * 实现方式一：急切实例化
 *
 * 实现比较方便，无论使不使用都会创建
 */
public class MySingleton {

    private static MySingleton uniqueInstance = new MySingleton();

    //为了不让别人实例化自己
    private MySingleton(){}

    public static MySingleton getInstance() {
        return uniqueInstance;
    }

    public static void main(String[] args) {
        MySingleton instance = MySingleton.getInstance();
        MySingleton instance2 = MySingleton.getInstance();
        assert instance == instance2;
    }
}
