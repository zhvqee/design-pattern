package pattern.structural.filter;

import java.util.List;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.bridge
 * @ClassName: Critera
 * @Description:
 * @Date: 2021/10/26 8:24 下午
 * @Version: 1.0
 */
public interface Critera {

    List<ObjectIns> meet(List<ObjectIns> insList);
}
