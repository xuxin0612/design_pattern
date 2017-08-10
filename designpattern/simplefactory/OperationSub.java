package designpattern.simplefactory;

/**
 * Created by xuxin on 2017/8/9.
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        double result = 0.0;
        result = getNumberA() - getNumberB();
        return result;
    }

}
