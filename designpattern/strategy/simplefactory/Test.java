package designpattern.strategy.simplefactory;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Test {

    public static void main(String[] args) {
        CashSuper csuper = CashFactory.createCashAccept("U300R100");
        double totalPrice = 0.0;
        totalPrice = csuper.acceptCash(60.0 * 5.0);
        System.out.println(totalPrice);
    }
}
