package designpattern.state;


/**
 * Created by xuxin on 2017/8/11.
 */
public class ConcreteStateB extends State {
    @Override public void MyHandle(Context _context) {
        _context.setState(new ConcreteStateA());
    }
}
