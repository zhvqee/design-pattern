package pattern.crearte.abstractfactory;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.abstractfactory
 * @ClassName: FactoryGenerate
 * @Description:
 * @Date: 2021/10/25 7:49 下午
 * @Version: 1.0
 */
public class FactoryProducer {

    public static AbstractFactory generate(String param) {
        if (param.equals("A")) {
            return new ProductAFactory();
        } else if (param.equals("B")) {
            return new ProductBFactory();
        }
        return null;
    }
}
