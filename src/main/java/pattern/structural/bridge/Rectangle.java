package pattern.structural.bridge;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.bridge
 * @ClassName: Rectangle
 * @Description:
 * @Date: 2021/10/26 8:13 下午
 * @Version: 1.0
 */
public class Rectangle extends Shape {

    public Rectangle(DrawApi drawApi) {
        super(drawApi);

    }

    @Override
    public void draw() {
        drawApi.draw(null, 1, 1);
    }
}
