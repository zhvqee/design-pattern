package pattern.structural.filter;

import java.util.List;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.filter
 * @ClassName: AndCritera
 * @Description:
 * @Date: 2021/10/26 8:28 下午
 * @Version: 1.0
 */
public class AndCritera implements Critera {
    private Critera a;

    public AndCritera(Critera a, Critera b) {
        this.a = a;
        this.b = b;
    }

    private Critera b;

    @Override
    public List<ObjectIns> meet(List<ObjectIns> insList) {
        return b.meet(a.meet(insList));
    }
}
