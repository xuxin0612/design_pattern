package designpattern.Proxy.example;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Test {

    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy daili = new Proxy(jiaojiao);

        daili.GiveDolls();
        daili.GiveFlowers();
        daili.GiveChocolate();

    }
}
