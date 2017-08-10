package designpattern.simplefactory;

/**
 * Factory Pattern
 * Created by xuxin on 2017/8/9.
 */
public class OperationFactory {

    public static Operation createOperation(char _operate){
        Operation operate = null;
        switch(_operate)
        {
            case '+':
            {
                operate = new OperationAdd();
                break;
            }
            case '-':
            {
                operate = new OperationSub();
                break;
            }
            case '*':
            {
                operate = new OperationMul();
                break;
            }
            case '/':
            {
                operate = new OperationDiv();
                break;
            }
        }
        return operate;
    }

}
