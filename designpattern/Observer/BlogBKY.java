package designpattern.Observer;

import java.util.List;

/**
 * Created by xuxin on 2017/8/11.
 */
public class BlogBKY extends Blog {

    public BlogBKY(){

    }

    public BlogBKY(String name){
        m_name = name;
    }

    public void SetStatus(String s)
    {
        m_status = s ;
    }
    public String GetStatus()
    {
        return m_status;
    }
    private String m_name;
}
