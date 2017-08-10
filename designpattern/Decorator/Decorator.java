package designpattern.Decorator;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Decorator extends Component {

    protected Component component;

    public void setComponent(Component _component) {
        component = _component;
    }

    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
