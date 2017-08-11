package designpattern.builder;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Director {

    public void Constructor(Builder _builder)
    {
        _builder.BuildPartA();
        _builder.BuildPartB();
    }
}
