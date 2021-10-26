package pattern.structural.filter;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.filter
 * @ClassName: CriteraPatternTest
 * @Description:
 * @Date: 2021/10/26 8:36 下午
 * @Version: 1.0
 */
public class CriteraPatternTest {
    public static void main(String[] args) {
        ObjectIns objectIns = new ObjectIns("red", 1);
        ObjectIns objectIns2 = new ObjectIns("black", 1);

        ObjectIns objectIns3 = new ObjectIns("red", 5);
        ObjectIns objectIns4 = new ObjectIns("white", 5);

        List<ObjectIns> objectInsList = Arrays.asList(objectIns,objectIns2,objectIns3,objectIns4);

        Critera redCritera = new RedCritera();

        Critera bigCritera = new BigCritera();

        Critera andCritera = new AndCritera(redCritera,bigCritera);
        List<ObjectIns> meet = andCritera.meet(objectInsList);
        System.out.println(meet);
    }
}
