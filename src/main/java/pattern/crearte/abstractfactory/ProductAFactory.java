package pattern.crearte.abstractfactory;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.abstractfactory
 * @ClassName: ProductAFactory
 * @Description:
 * @Date: 2021/10/25 7:50 下午
 * @Version: 1.0
 */
public class ProductAFactory extends AbstractFactory {
    public Product generate() {
        return new ConcreteProductA();
    }
}
