package designpattern.Decorator;

/**
 * Created by xuxin on 2017/8/10.
 */
public class ConcreteDecoratorB extends Decorator{

    public void operation()
    {
        super.operation();
        AddedBehavior();
//        cout << "具体装饰对象A的操作" << endl;
    }

    private void AddedBehavior(){

    }
}
