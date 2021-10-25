package pattern.crearte.prototype;

import java.util.List;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.prototype
 * @ClassName: Square
 * @Description:
 * @Date: 2021/10/25 8:02 下午
 * @Version: 1.0
 */
public class Square extends Shape {

    private List<String> property;

    public List<String> getProperty() {
        return property;
    }

    public void setProperty(List<String> property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Square{" +
                "property='" + property + '\'' +
                '}';
    }
}
