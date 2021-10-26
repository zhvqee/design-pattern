package pattern.structural.bridge;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.bridge
 * @ClassName: CircleDrawApi
 * @Description:
 * @Date: 2021/10/26 8:08 下午
 * @Version: 1.0
 */
public class CircleDrawApi implements DrawApi {
    @Override
    public void draw(String name, int x, int y) {
        System.out.println("circle" + "==>" + x + "," + y);
    }
}
