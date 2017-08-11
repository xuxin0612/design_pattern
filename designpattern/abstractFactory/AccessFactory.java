package designpattern.abstractFactory;

/**
 * Created by xuxin on 2017/8/11.
 */
public class AccessFactory implements IFactory {
    @Override public IUser CreateUser() {
        return new AccessUser();
    }
}
