package designpattern.Observer.example;

/**
 * Created by xuxin on 2017/8/11.
 */
public abstract class Observer {

    protected String name;
    protected Subject subject;

    public Observer(String _name, Subject _subject) {
        name = _name;
        subject = _subject;
    }

    public abstract void Update();
}
