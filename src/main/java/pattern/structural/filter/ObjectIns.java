package pattern.structural.filter;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.filter
 * @ClassName: ObjectIns
 * @Description:
 * @Date: 2021/10/26 8:25 下午
 * @Version: 1.0
 */
public class ObjectIns {

    private String color;

    private Integer size;

    public ObjectIns(String color, Integer size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ObjectIns{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
