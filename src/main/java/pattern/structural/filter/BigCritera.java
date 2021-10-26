package pattern.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.filter
 * @ClassName: RedCritera
 * @Description:
 * @Date: 2021/10/26 8:26 下午
 * @Version: 1.0
 */
public class BigCritera implements Critera {
    @Override
    public List<ObjectIns> meet(List<ObjectIns> insList) {
        return insList.stream().filter(e -> e.getSize() > 4).collect(Collectors.toList());
    }
}
