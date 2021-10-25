package pattern.crearte.factorymethod;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.factorymethod
 * @ClassName: FactoryMethodTest
 * @Description:
 * @Date: 2021/10/25 7:44 下午
 * @Version: 1.0
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        AbstractFactory factory = new ProductAFactory();
        Product product = factory.generate();
        product.diff();

        factory = new ProductBFactory();
        product = factory.generate();
        product.diff();
    }
}
