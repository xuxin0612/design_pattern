package designpattern.Observer;

/**
 * Created by xuxin on 2017/8/11.
 */
public class ObserverBlog extends Observer {
    private String m_name;
    private Blog m_blog;

    public ObserverBlog(String name, Blog blog) {
        m_name = name;
        m_blog = blog;
    }

    public ObserverBlog() {

    }

    @Override
    public void Update() {
        String status = m_blog.GetStatus();
//        cout << m_name  <<"-------" << status <<endl;
    }
}
