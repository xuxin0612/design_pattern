package designpattern.strategy.strategefactory;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Test {

    public static void main(String[] args) {
        double total = 0.0;
        CashContext csuper = new CashContext("U300R100");
        double totalPrice = 0.0;
        totalPrice = csuper.getResult(60.0*5.0);
        System.out.println(totalPrice);;
    }
}
