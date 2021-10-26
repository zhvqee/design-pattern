package pattern.structural.proxy;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.proxy
 * @ClassName: Person
 * @Description:
 * @Date: 2021/10/26 4:18 下午
 * @Version: 1.0
 */
public class Person implements Behavior {

    @Override
    public void say() {
        System.out.println("abc");
    }
}
