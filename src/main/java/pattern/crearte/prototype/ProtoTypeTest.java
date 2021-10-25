package pattern.crearte.prototype;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.prototype
 * @ClassName: ProtoTypeTest
 * @Description:
 * @Date: 2021/10/25 8:06 下午
 * @Version: 1.0
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        Shape shape = ShapeCache.getShape("square");
        System.out.println(shape);
        Square square1= (Square) shape;
        System.out.println(square1.getProperty()==((Square)ShapeCache.shapeMap.get("square")).getProperty());

    }
}

