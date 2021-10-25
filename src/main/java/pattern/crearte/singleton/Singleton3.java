package pattern.crearte.singleton;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.singleton
 * @ClassName: Singleton1
 * @Description:
 * @Date: 2021/10/25 8:19 下午
 * @Version: 1.0
 */
public class Singleton3 {


    private static class ObjectInstanceHolder {
        private static ObjectInstance objectInstance = new ObjectInstance();

    }

    public static ObjectInstance getInstance() {
        return ObjectInstanceHolder.objectInstance;
    }
    public static void print() {
        System.out.println("123");
    }

    public static void main(String[] args) throws InterruptedException {
        Singleton3.print();
        ObjectInstance objectInstance = Singleton3.getInstance();

        Thread.sleep(10000);
    }

}
