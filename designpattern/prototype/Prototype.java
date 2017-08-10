package designpattern.prototype;

/**
 * Created by xuxin on 2017/8/10.
 */
public abstract class Prototype {
    private String id;

    public Prototype() {

    }

    public Prototype(String _id) {
        id = _id;
    }

    public abstract Prototype Clones();

    public String getID() {
        return id;
    }

    public void setID(String _id) {
        id = _id;
    }
}
