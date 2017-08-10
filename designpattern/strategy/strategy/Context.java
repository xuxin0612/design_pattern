package designpattern.strategy.strategy;

/**
 * Created by xuxin on 2017/8/9.
 */
public class Context {

    public Context(Strategy _strategy)
    {
        strategy = _strategy;
    }
    void contextInterface()
    {
        strategy.algorithmInterface();
    }
    private Strategy strategy;


}
