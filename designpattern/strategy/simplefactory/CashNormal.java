package designpattern.strategy.simplefactory;

/**
 * Created by xuxin on 2017/8/9.
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double _money) {
        return _money;
    }
}
