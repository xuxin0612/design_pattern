package designpattern.Observer.example;

/**
 * Created by xuxin on 2017/8/11.
 */
public class StockObserver extends Observer {

    public StockObserver(String _name,Subject _subject)
    {
        super(_name, _subject);
    }
    public void Update()
    {
//        cout << subject->getSubjectState() << "," << name << "关闭股票行情，继续工作" << endl;
        subject.getSubjectState();
    }
}
