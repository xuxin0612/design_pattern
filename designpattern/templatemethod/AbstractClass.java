package designpattern.templatemethod;

/**
 * Created by xuxin on 2017/8/10.
 */
public abstract class AbstractClass {
    public abstract void PrimitiveOperation1();
    public abstract void PrimitiveOperation2();
    void TemplateMethod()
    {
        PrimitiveOperation1();
        PrimitiveOperation2();
    }

}
