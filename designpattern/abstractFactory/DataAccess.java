package designpattern.abstractFactory;

/**
 * Created by xuxin on 2017/8/11.
 */
public class DataAccess {

    public static IUser CreateUser()
    {
        IUser result = null;
        switch(db)
        {
            case 1:
            {
                result = new SqlserverUser();
                break;
            }
            case 2:
            {
                result = new AccessUser();
                break;
            }
        }
        return result;
    }

    private static int db;
    // const string db = "Access";
    // 1 = Sqlserver 2 = Access
}
