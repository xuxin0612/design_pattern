package designpattern.factorymethod;

import designpattern.simplefactory.Operation;
import designpattern.simplefactory.OperationMul;

/**
 * Created by xuxin on 2017/8/10.
 */
public class MulFactory extends IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
