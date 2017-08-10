package designpattern.Proxy.example;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Proxy extends IGiveGift {

    private Pursuit gg;

    public Proxy(SchoolGirl _mm)
    {
        gg = new Pursuit(_mm);
    }

    @Override public void GiveDolls() {
        gg.GiveDolls();
    }

    @Override public void GiveFlowers() {
        gg.GiveFlowers();
    }

    @Override public void GiveChocolate() {
        gg.GiveChocolate();
    }
}
