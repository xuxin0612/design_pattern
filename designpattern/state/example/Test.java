package designpattern.state.example;

/**
 * Created by xuxin on 2017/8/11.
 */
public class Test {

    public static void main(String[] args) {
        Work emergencyProjects = new Work();
        emergencyProjects.setState(new ForenoonState());
        emergencyProjects.setHour(9);
        emergencyProjects.WriteProgram();


        emergencyProjects.setHour(10);
        emergencyProjects.WriteProgram();

        emergencyProjects.setHour(12);
        emergencyProjects.WriteProgram();


        emergencyProjects.setHour(14);
        emergencyProjects.WriteProgram();

        // 完成工作，不需要再加班了
        // emergencyProjects.setFinish(true);

        emergencyProjects.setHour(19);
        emergencyProjects.WriteProgram();

        emergencyProjects.setHour(22);
        emergencyProjects.WriteProgram();
//        return 0;
    }
}
