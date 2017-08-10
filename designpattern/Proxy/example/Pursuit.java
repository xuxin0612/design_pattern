package designpattern.Proxy.example;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Pursuit extends IGiveGift {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl _mm)
    {
        mm = _mm;
    }

    @Override public void GiveDolls() {
//        cout << mm->getName() << " 送你洋娃娃" << endl;
    }

    @Override public void GiveFlowers() {
//        cout << mm->getName() << " 送你鲜花" << endl;
    }

    @Override public void GiveChocolate() {
//        cout << mm->getName() << " 送你巧克力" << endl;
    }
}
