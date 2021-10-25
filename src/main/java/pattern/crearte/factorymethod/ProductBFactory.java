package pattern.crearte.factorymethod;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.factorymethod
 * @ClassName: ProductAFactory
 * @Description:
 * @Date: 2021/10/25 7:42 下午
 * @Version: 1.0
 */
public class ProductBFactory extends AbstractFactory {
    public Product generate() {
        return new ConcreteProductB();
    }
}
