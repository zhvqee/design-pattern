package pattern.crearte.buider;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.buider
 * @ClassName: Product
 * @Description:
 * @Date: 2021/10/25 8:37 下午
 * @Version: 1.0
 */
public class ProductTest {

    public static void main(String[] args) {
        Product product = Product.builder().a(1).b("1").c(1L).build();
        System.out.println(product);
    }
}
