package singletonp;

/**
 * 实现方式三：延迟实例化线程安全（synchronized版本）
 *
 * 只要需要的时候才会创建，并且只会创建一次，不好的一点就是性能太差，每次调用都是synchronized
 */
public class MySingleton3 {

    private static MySingleton3 uniqueInstance;

    private MySingleton3() { }

    public static synchronized MySingleton3 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MySingleton3();
        }
        return uniqueInstance;
    }
}
