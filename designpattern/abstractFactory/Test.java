package designpattern.abstractFactory;

/**
 * Created by xuxin on 2017/8/11.
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        IFactory factory = new SqlServerFactory();
        IUser iu = factory.CreateUser();
        iu.Insert(user);
        iu.GetUser(1);
//        return 0;



//        User user = new User();
//        Department* department = new Department();

        IUser iu2 = DataAccess.CreateUser();
        iu.Insert(user);
        iu.GetUser(1);
    }
}
