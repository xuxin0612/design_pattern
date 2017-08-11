package designpattern.state;

/**
 * Created by xuxin on 2017/8/11.
 */
public class Context {

    private State state;

    public Context(State _state) {
        state = _state;
    }

    public State getState() {
        return state;
    }

    public void setState(State _state) {
        state = _state;
    }

    public void Request() {
        state.MyHandle(this);
    }
}
