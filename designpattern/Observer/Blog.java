package designpattern.Observer;

import java.util.Iterator;
import java.util.List;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Blog {

    protected String m_status;
    private List<Observer> m_observers;

    public Blog(List<Observer> observers) {
        m_observers = observers;
    }

    public Blog(){

    }
    //    virtual ~Blog() {}
    public void Attach(Observer observer) {
        m_observers.add(observer);
    }

    public void Remove(Observer observer) {
        m_observers.remove(observer);
    }

    public void Notify() {
        Iterator<Observer> iter = m_observers.iterator();
        if (iter.hasNext()) {
            iter.next().Update();
        }
//        list<Observer*>::iterator iter = m_observers.begin();
//        for(;iter != m_observers.end(); iter++)
//            (*iter)->Update();
    }

    public void SetStatus(String s) {
        m_status = s;
    }

    public String GetStatus() {
        return m_status;
    }
}
