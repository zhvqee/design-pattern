package pattern.crearte.abstractfactory;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.abstractfactory
 * @ClassName: AbstractFactoryTest
 * @Description:
 * @Date: 2021/10/25 7:53 下午
 * @Version: 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.generate("A");
        Product generate = abstractFactory.generate();
        generate.diff();
    }
}
