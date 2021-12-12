public class Singleton3 {
    // 启动初始化，下面的 getInstance() 方法，直接返回此对象
    private static Singleton3 uniqueInstance = new Singleton3();

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        return uniqueInstance;
    }
}
