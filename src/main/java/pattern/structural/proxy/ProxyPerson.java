package pattern.structural.proxy;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.proxy
 * @ClassName: ProxyPerson
 * @Description:
 * @Date: 2021/10/26 4:19 下午
 * @Version: 1.0
 */
public class ProxyPerson implements Behavior {
    private Person person = new Person();

    @Override
    public void say() {
        System.out.println("我的代理人说:");
        person.say();
    }
}
