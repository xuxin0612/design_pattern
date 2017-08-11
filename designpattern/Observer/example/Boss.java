package designpattern.Observer.example;

import java.util.Vector;

/**
 * Created by xuxin on 2017/8/11.
 */
public class Boss extends Subject {

    private Vector<Observer> observers;
    private String action;

    public void Attach(Observer _observer) {
        observers.add(_observer);
    }

    public void Detach(Observer _observer) {
        observers.remove(_observer);
    }

    public void Notify() {
        for (Observer observer : observers) {
            observer.Update();
        }
    }

    public String getSubjectState() {
        return action;
    }

    public void setSubjectState(String _state) {
        action = _state;
    }
}
