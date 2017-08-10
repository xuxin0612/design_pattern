package designpattern.prototype;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Prototype1 extends  Prototype{
    @Override public Prototype Clones() {
        return new Prototype1(this);
    }

    public Prototype1()
    {

    }
    public Prototype1(String _id)
    {

    }
    public Prototype1(Prototype1 _type)
    {
        setID(_type.getID());
    }

}
