package designpattern.factorymethod;

import designpattern.simplefactory.Operation;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Test {

    public static void main(String[] args) {
        IFactory operationFactory = new AddFactory();
        Operation operation = operationFactory.createOperation();
        operation.setNumberA(10);
        operation.setNumberB(5);
        double result = operation.getResult();
        System.out.println(result);
    }
}
