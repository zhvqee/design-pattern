package pattern.crearte.simplefactory;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte
 * @ClassName: SimpleFactory
 * @Description:
 * @Date: 2021/10/25 7:27 下午
 * @Version: 1.0
 */
public class SimpleFactory {


    public static Product generate(String param) {
        if (param.equals("A")) {
            return new ConcreteProductA();
        } else if (param.equals("B")) {
            return new ConcreteProductB();
        }
        return null;
    }
}
