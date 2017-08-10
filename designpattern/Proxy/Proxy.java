package designpattern.Proxy;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Proxy extends Subject {
    private RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.Request();
    }
}
