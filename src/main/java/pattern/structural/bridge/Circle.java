package pattern.structural.bridge;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.bridge
 * @ClassName: Circle
 * @Description:
 * @Date: 2021/10/26 8:11 下午
 * @Version: 1.0
 */
public class Circle extends Shape {
    private int x;
    private int y;

    private String name;

    public Circle(int x, int y, String name, DrawApi api) {
        super(api);
        this.x = x;
        this.y = y;
        this.name = name;
    }

    @Override
    public void draw() {
        drawApi.draw(name, x, y);
    }
}
