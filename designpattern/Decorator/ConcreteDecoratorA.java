package designpattern.Decorator;

/**
 * Created by xuxin on 2017/8/10.
 */
public class ConcreteDecoratorA extends Decorator{

    public void operation()
    {
        super.operation();
        addedState = "New State";
//        cout << "具体装饰对象A的操作" << endl;
    }

    private String addedState;
}
