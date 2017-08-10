package designpattern.Decorator;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Test {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        concreteDecoratorA.setComponent(concreteComponent); // 先给具体对象装饰A
        concreteDecoratorB.setComponent(concreteDecoratorA); // 然后给装饰了A的对象装饰B
        concreteDecoratorB.operation(); // 显示一下装饰B后的情况
    }

}
