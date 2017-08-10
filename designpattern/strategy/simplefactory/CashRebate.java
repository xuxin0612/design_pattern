package designpattern.strategy.simplefactory;

/**
 * Created by xuxin on 2017/8/9.
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1.0;

    public CashRebate(double _moneyRebate) {
        moneyRebate = _moneyRebate;
    }

    public double acceptCash(double _money) {
        return _money * moneyRebate;
    }
}
