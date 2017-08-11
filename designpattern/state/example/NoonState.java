package designpattern.state.example;

/**
 * Created by xuxin on 2017/8/11.
 */
public class NoonState extends State {
    @Override public void WriteProgram(Work _w) {
        if(_w.getHour() < 13)
        {
//            cout << "当前时间" << _w->getHour() << "点 饿了，午饭；犯困，午休" << endl;
        }
        else
        {
            _w.setState(new AfternoonState());
            _w.WriteProgram();
        }
    }
}
