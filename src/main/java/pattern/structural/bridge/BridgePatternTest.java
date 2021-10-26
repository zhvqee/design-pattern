package pattern.structural.bridge;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.bridge
 * @ClassName: BridgePatternTest
 * @Description:
 * @Date: 2021/10/26 8:14 下午
 * @Version: 1.0
 */
public class BridgePatternTest {

    public static void main(String[] args) {
        Shape shape = new Circle(1, 1, "1", new CircleDrawApi());
        shape.draw();
    }
}
