package designpattern.Observer.example;

/**
 * Created by xuxin on 2017/8/11.
 */
public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject _subject, String _name) {
        super(_name, _subject);
    }

    public void Update() {
        observerState = subject.getSubjectState();
//        cout << "观察者" << name << "的新状态是" << observerState << endl;
    }

    public String getConcreteSubjectState() {
        return subject.getSubjectState();
    }

    public void setConcreteSubjectState(String _value) {
        observerState = _value;
    }
}
