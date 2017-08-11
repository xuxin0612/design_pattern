package designpattern.builder;

/**
 * Created by xuxin on 2017/8/10.
 */
public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    public void BuildPartA() {
        product.Add("部件X");
    }

    public void BuildPartB() {
        product.Add("部件Y");
    }

    public Product GetResult() {
        return product;
    }
}
