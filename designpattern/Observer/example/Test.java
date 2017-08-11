package designpattern.Observer.example;

/**
 * Created by xuxin on 2017/8/11.
 */
public class Test {

    public static void main(String[] args) {
        Boss huhansan = new Boss();

        StockObserver tongshi1 = new StockObserver("aaa",huhansan);
        StockObserver tongshi2 = new StockObserver("bbb",huhansan);

        huhansan.Attach(tongshi1);
        huhansan.Attach(tongshi2);

        huhansan.Detach(tongshi1);

        huhansan.setSubjectState("我胡汉三回来了");
        huhansan.Notify();
//        return 0;

        ConcreteSubject s = new ConcreteSubject();
        s.Attach(new ConcreteObserver(s,"X"));
        s.Attach(new ConcreteObserver(s,"Y"));
        s.Attach(new ConcreteObserver(s,"Z"));

        s.setSubjectState("ABC");
        s.Notify();
    }
}
