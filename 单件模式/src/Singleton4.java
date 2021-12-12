// 双重加锁
public class Singleton4 {
    private volatile static Singleton4 uniqueSingleton;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (uniqueSingleton == null) {
            synchronized (Singleton4.class) {
                if (uniqueSingleton == null) {
                    uniqueSingleton = new Singleton4();
                }
            }
        }
        return uniqueSingleton;
    }
}
