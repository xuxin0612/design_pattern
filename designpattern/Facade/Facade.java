package designpattern.Facade;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Facade {

    public Facade()
    {
        one = new SubsystemOne();
        two = new SubsystemTwo();
        three = new SubsystemThree();
        four = new SubsystemFour();
    }
    public void MethodA()
    {
//        cout << "方法组A：" << endl;
        one.MethodOne();
        two.MethodTwo();
        four.MethodFour();
    }
    void MethodB()
    {
//        cout << "方法组B：" << endl;
        two.MethodTwo();
        three.MethodThree();
    }
    private SubsystemOne one;
    private SubsystemTwo two;
    private SubsystemThree three;
    private SubsystemFour four;
}
