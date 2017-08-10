package designpattern.factorymethod;

import designpattern.simplefactory.Operation;
import designpattern.simplefactory.OperationDiv;

/**
 * Created by xuxin on 2017/8/10.
 */
public class DivFactory extends IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
