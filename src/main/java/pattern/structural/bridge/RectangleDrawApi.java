package pattern.structural.bridge;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.bridge
 * @ClassName: RectangleDrawApi
 * @Description:
 * @Date: 2021/10/26 8:09 下午
 * @Version: 1.0
 */
public class RectangleDrawApi implements DrawApi {
    @Override
    public void draw(String name, int x, int y) {
        System.out.println("rect" + "==>" + x + "," + y);
    }
}
