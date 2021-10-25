package pattern.crearte.simplefactory;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.simplefactory
 * @ClassName: SimpleFactoryTest
 * @Description:
 * @Date: 2021/10/25 7:43 下午
 * @Version: 1.0
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Product generate = SimpleFactory.generate("A");
        generate.diff();
        generate = SimpleFactory.generate("B");
        generate.diff();
    }
}
