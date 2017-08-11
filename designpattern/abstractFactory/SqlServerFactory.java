package designpattern.abstractFactory;

/**
 * Created by xuxin on 2017/8/11.
 */
public class SqlServerFactory implements IFactory {
    @Override public IUser CreateUser() {
        return new SqlserverUser();
    }
}
