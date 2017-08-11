package designpattern.state.example;

/**
 * Created by xuxin on 2017/8/11.
 */
public class EveningState extends State {

    public void WriteProgram(Work _w)
    {
        if(_w.TaskFinished())
        {
            _w.setState(new RestState());
            _w.WriteProgram();
        }
        else
        {
            if(_w.getHour() < 21)
            {
//                cout << "当前时间" << _w->getHour() << "点 加班哦，疲累至极" << endl;
            }
            else
            {
                _w.setState(new SleepingState());
                _w.WriteProgram();
            }
        }
    }
}
