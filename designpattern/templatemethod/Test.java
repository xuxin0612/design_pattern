package designpattern.templatemethod;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Test {

    public static void main(String[] args) {
        AbstractClass c;
        c = new ConcreteA();
        c.TemplateMethod();

        c = new ConcreteB();
        c.TemplateMethod();
    }
}
