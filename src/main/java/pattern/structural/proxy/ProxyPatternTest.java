package pattern.structural.proxy;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.proxy
 * @ClassName: ProxyPatternTest
 * @Description:
 * @Date: 2021/10/26 4:21 下午
 * @Version: 1.0
 */
public class ProxyPatternTest {

    public static void main(String[] args) {

        Behavior behavior = new ProxyPerson();
        behavior.say();
    }
}
