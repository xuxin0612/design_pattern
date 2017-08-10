package designpattern.prototype;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Test {

    public static void main(String[] args) {
        Prototype obj1 = new Prototype1("1");
        Prototype obj2 = obj1.Clones();
        Prototype obj3 = obj2.Clones();

//        cout << obj1->getID() << endl;
//        cout << obj2->getID() << endl;
//        cout << obj3->getID() << endl;

    }
}
