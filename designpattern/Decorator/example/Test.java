package designpattern.Decorator.example;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Test {

    public static void main(String[] args) {
        Person xc = new Person("小菜");

//        cout << "First Decoration:" << endl;

        BigTrouser kk = new BigTrouser();
        TShirts dtx = new TShirts();

        kk.Decorate(xc);
        dtx.Decorate(kk);
        dtx.Show();

//        cout << "Second Decoration:" << endl;

//        TShirts dtx2 = new TShirts();
//        LeatherShoes* px = new LeatherShoes();
//        Tie* ld = new Tie();
//        Suit* xz = new Suit();
//
//        px->Decorate(xc);
//        ld->Decorate(px);
//        xz->Decorate(ld);
//        xz->Show();
//        return 0;
    }
}
