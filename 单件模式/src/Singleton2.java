public class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2() {
    }

    // 增加 synchronized 关键字，初始化方法单线程执行，性能降低
    public static synchronized Singleton2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }


}
