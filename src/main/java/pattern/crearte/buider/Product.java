package pattern.crearte.buider;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.crearte.buider
 * @ClassName: Product
 * @Description:
 * @Date: 2021/10/25 8:37 下午
 * @Version: 1.0
 */
public class Product {

    private Integer a;

    private String b;


    private Long c;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Long getC() {
        return c;
    }

    public void setC(Long c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Product{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", c=" + c +
                '}';
    }

    private Product() {
    }

    public static Builder builder() {
        return new Builder(new Product());
    }


    public static class Builder {

        private Product product;

        private Builder(Product product) {
            this.product = product;
        }

        public Builder a(Integer a) {
            product.a = a;
            return this;
        }

        public Builder b(String b) {
            product.b = b;
            return this;
        }

        public Builder c(Long c) {
            product.c = c;
            return this;
        }

        Product build() {
            return product;
        }
    }


}
