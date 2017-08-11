package designpattern.builder;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.Constructor(b1);
        Product p1 = b1.GetResult();
        p1.Show();

        director.Constructor(b2);
        Product p2 = b2.GetResult();
        p2.Show();
//        return 0;
    }
}
