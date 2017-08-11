package designpattern.state.example;

/**
 * Created by xuxin on 2017/8/11.
 */
public class ForenoonState extends State {
    @Override public void WriteProgram(Work _w) {
        if(_w.getHour() < 12)
        {
//            cout << "当前时间" << _w->getHour() << "点 上午工作，精神百倍" << endl;
        }
        else
        {
            _w.setState(new NoonState());
            _w.WriteProgram();
        }
    }
}
