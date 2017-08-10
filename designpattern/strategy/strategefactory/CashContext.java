package designpattern.strategy.strategefactory;

import designpattern.strategy.simplefactory.CashNormal;
import designpattern.strategy.simplefactory.CashRebate;
import designpattern.strategy.simplefactory.CashReturn;
import designpattern.strategy.simplefactory.CashSuper;

/**
 * Created by xuxin on 2017/8/10.
 */
public class CashContext {
    final String type1 = "normal";
    final String type2 = "U300R100";
    final String type3 = "0.8Rebate";
    private CashSuper cashSuper = null;

    public CashContext(String type) {
        if (type1 == type) {
            cashSuper = new CashNormal();
        } else if (type2 == type) {
            cashSuper = new CashReturn(300, 100);
        } else if (type3 == type) {
            cashSuper = new CashRebate(0.8);
        } else {
            System.err.println("no type");
        }
    }

    double getResult(double _money) {
        return cashSuper.acceptCash(_money);
    }

}
