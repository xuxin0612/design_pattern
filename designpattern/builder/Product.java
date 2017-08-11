package designpattern.builder;

import java.util.Vector;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Product {

    private Vector<String> parts;

    public void Add(String _part) {
        parts.add(_part);
    }

    public void Show() {
//        cout << "产品创建：" << endl;
        for (String part : parts) {
//            cout << part << endl;
        }
    }
}
