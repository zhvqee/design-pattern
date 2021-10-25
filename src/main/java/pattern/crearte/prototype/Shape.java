package pattern.crearte.prototype;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.prototype
 * @ClassName: Shape
 * @Description:
 * @Date: 2021/10/25 7:59 下午
 * @Version: 1.0
 */
public abstract class Shape implements Cloneable {


    public void print() {
        System.out.println(this);
    }

    // 浅拷贝
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
