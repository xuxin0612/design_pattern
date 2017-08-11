package designpattern.state.example;

/**
 * Created by xuxin on 2017/8/11.
 */
public class Work {

    private State current;
    private double hour;
    private boolean finfish = false;

    public Work() {
        current = null;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double _hour) {
        hour = _hour;
    }

    public boolean TaskFinished() {
        return finfish;
    }

    public void setState(State _s) {
        current = _s;
    }

    void WriteProgram() {
        current.WriteProgram(this);
    }

    void setFinish(boolean _isFinish) {
        finfish = _isFinish;
    }
}
