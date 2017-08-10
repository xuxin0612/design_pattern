package designpattern.Decorator.example;

/**
 * Created by xuxin on 2017/8/10.
 */
public class Finery extends Person{

    public void Decorate(Person _compomn){
        component = _compomn;
    }

    protected Person component;

    public void Show(){
        if(component != null){
            component.Show();
        }
    }
}
