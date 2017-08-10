package designpattern.factorymethod;

import designpattern.simplefactory.Operation;
import designpattern.simplefactory.OperationAdd;

/**
 * Created by xuxin on 2017/8/10.
 */
public class AddFactory extends IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
