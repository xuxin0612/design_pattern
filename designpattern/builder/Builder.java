package designpattern.builder;

/**
 * Created by xuxin on 2017/8/10.
 */
public abstract class Builder {

    public abstract void BuildPartA();
    public abstract void BuildPartB();
    public abstract Product GetResult();
}
