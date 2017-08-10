package designpattern.simplefactory;

/**
 * Created by xuxin on 2017/8/9.
 */

public class Test {

    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperation('+');
        operate.setNumberA(10);
        operate.setNumberB(5);
        System.out.println(operate.getResult());
    }
}
