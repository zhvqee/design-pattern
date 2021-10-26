package pattern.structural.bridge;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.bridge
 * @ClassName: Shape
 * @Description:
 * @Date: 2021/10/26 8:10 下午
 * @Version: 1.0
 */
public abstract class Shape {

    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
