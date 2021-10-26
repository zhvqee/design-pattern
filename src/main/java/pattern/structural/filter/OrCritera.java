package pattern.structural.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.filter
 * @ClassName: AndCritera
 * @Description:
 * @Date: 2021/10/26 8:28 下午
 * @Version: 1.0
 */
public class OrCritera implements Critera {
    private Critera a;

    public OrCritera(Critera a, Critera b) {
        this.a = a;
        this.b = b;
    }

    private Critera b;

    @Override
    public List<ObjectIns> meet(List<ObjectIns> insList) {

        Set<ObjectIns> fitler = new HashSet<>();
        fitler.addAll(a.meet(insList));
        fitler.addAll(b.meet(insList));
        return new ArrayList<>(fitler);
    }
}
