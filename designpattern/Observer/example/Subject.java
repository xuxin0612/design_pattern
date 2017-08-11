package designpattern.Observer.example;

/**
 * Created by xuxin on 2017/8/11.
 */
public abstract class Subject {

    public abstract void Attach(Observer _observer);
    public abstract void Detach(Observer _observer);
    public abstract void Notify();
    public abstract String getSubjectState();
    public abstract void setSubjectState(String _state);
}
