package singletonp;

/**
 * 实现方式四：双重检测加锁
 *
 * 优点就是提高性能，只会在第一次调用时使用synchronized
 */
public class MySingleton4{

    private volatile static MySingleton4 uniqueInstance;

//    private MySingleton4() { }

    public static MySingleton4 getInstance() {
        if (uniqueInstance == null ){
            synchronized (MySingleton4.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new MySingleton4();
                }
            }
        }
        return uniqueInstance;
    }
}
