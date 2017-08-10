package designpattern.factorymethod;

import designpattern.simplefactory.Operation;
import designpattern.simplefactory.OperationSub;

/**
 * Created by xuxin on 2017/8/10.
 */
public class SubFactory extends IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
