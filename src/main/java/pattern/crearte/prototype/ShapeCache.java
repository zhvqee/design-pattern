package pattern.crearte.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.prototype
 * @ClassName: ShapCache
 * @Description:
 * @Date: 2021/10/25 8:02 下午
 * @Version: 1.0
 */
public class ShapeCache {

    public static Map<String, Shape> shapeMap = new HashMap<>();

    static {
        shapeMap.put("rectangle", new Rectangle());
        Square square = new Square();
        ArrayList<String> objectArrayList = new ArrayList<>();
        objectArrayList.add("A");
        square.setProperty(objectArrayList);
        shapeMap.put("square", square);
    }

    public static Shape getShape(String shapeParam) {
        Shape shape = shapeMap.get(shapeParam);
        if (shape == null) {
            return null;
        }
        return (Shape) shape.clone();

    }


}
