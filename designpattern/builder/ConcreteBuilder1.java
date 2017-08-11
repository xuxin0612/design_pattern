package designpattern.builder;

/**
 * Created by xuxin on 2017/8/10.
 */
public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    public void BuildPartA() {
        product.Add("部件A");
    }

    public void BuildPartB() {
        product.Add("部件B");
    }

    public Product GetResult() {
        return product;
    }
}
