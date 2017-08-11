package designpattern.state.example;

/**
 * Created by xuxin on 2017/8/11.
 */
public class AfternoonState extends State {
    @Override public void WriteProgram(Work _w) {
        if(_w.getHour() < 17)
        {
//            cout << "当前时间" << _w.getHour() << "点 下午状态还不错，继续努力" << endl;
        }
        else
        {
            _w.setState(new EveningState());
            _w.WriteProgram();
        }
    }
}
