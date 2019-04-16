package singletonp;

/**
 * 实现方式二：延迟实例化
 *
 * 只要需要的时候才会创建，并且只会创建一次，但注意以下方式为线程不安全的
 */
public class MySingleton2 {

    private static MySingleton2 uniqueInstance;

    private MySingleton2() { }

    public static MySingleton2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MySingleton2();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        MySingleton2 instance = MySingleton2.getInstance();
        MySingleton2 instance2 = MySingleton2.getInstance();
        assert instance == instance2;
    }
}
