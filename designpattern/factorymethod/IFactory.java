package designpattern.factorymethod;

import designpattern.simplefactory.Operation;

/**
 * Created by xuxin on 2017/8/10.
 */
public abstract class IFactory {

    public abstract Operation createOperation();
}
