package designpattern.abstractFactory;

/**
 * Created by xuxin on 2017/8/11.
 */
public class AccessUser implements IUser {
    @Override public void Insert(User _user) {
//        cout << "在Access中给User表添加一条记录" << endl;
    }

    @Override public User GetUser(int _id) {
//        cout << "在Access中根据ID得到User表的一条记录" << endl;
        return null;
    }
}
