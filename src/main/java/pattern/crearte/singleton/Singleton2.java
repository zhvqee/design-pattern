package pattern.crearte.singleton;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.singleton
 * @ClassName: Singleton1
 * @Description:
 * @Date: 2021/10/25 8:19 下午
 * @Version: 1.0
 */
public class Singleton2 {


    private static ObjectInstance objectInstance = null;

    public static ObjectInstance getInstance() {

        if (objectInstance == null) {
            synchronized (Singleton2.class) {
                if (objectInstance == null) {
                    objectInstance = new ObjectInstance();
                }
            }
        }
        return objectInstance;
    }


    public static synchronized ObjectInstance getInstance2() {
        if (objectInstance == null) {
            objectInstance = new ObjectInstance();
        }
        return objectInstance;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {

                System.out.println(Singleton2.getInstance());

            }).start();
        }
        Thread.sleep(10000);
    }

}
