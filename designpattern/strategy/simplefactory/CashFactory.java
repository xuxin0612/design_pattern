package designpattern.strategy.simplefactory;

/**
 * Created by xuxin on 2017/8/9.
 */
public class CashFactory {

    public static CashSuper createCashAccept(String type) {

        CashSuper cashSuper = null;
        if ("normal" == type) {
            cashSuper = new CashNormal();
        } else if ("U300R100" == type) {
            cashSuper = new CashReturn(300, 100);
        } else if ("0.8Rebate" == type) {
            cashSuper = new CashRebate(0.8);
        } else {
            System.err.println("no type");
        }
        return cashSuper;
    }

}
