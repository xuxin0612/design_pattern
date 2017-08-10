package designpattern.strategy.simplefactory;

/**
 * Created by xuxin on 2017/8/9.
 */
public class CashReturn extends CashSuper {
    private double moneyCondition = 0.0;
    private double moneyReturn = 0.0;

    public CashReturn(double _moneyCondition, double _moneyReturn) {
        moneyCondition = _moneyCondition;
        moneyReturn = _moneyReturn;
    }

    public double acceptCash(double _money) {
        double result = _money;
        if (_money >= moneyCondition) {
            result = _money - (_money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
