package designpattern.simplefactory;

/**
 * Created by xuxin on 2017/8/9.
 */
public abstract class Operation {

    private double numberA = 0.0;
    private double numberB = 0.0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();
}
