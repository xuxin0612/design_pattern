package designpattern.Observer.example;

import java.util.Vector;
import sun.util.resources.cldr.bas.CalendarData_bas_CM;

/**
 * Created by xuxin on 2017/8/11.
 */
public class ConcreteSubject extends Subject{

    @Override public void Attach(Observer _observer) {
    }

    @Override public void Detach(Observer _observer) {

    }

    @Override public void Notify() {

    }

    public String getSubjectState()
    {
        return subjectState;
    }
    public void setSubjectState(String _state)
    {
        subjectState = _state;
    }
    private Vector<Observer> observers;
    private String subjectState;
}
