package designpattern.Observer;

/**
 * Created by xuxin on 2017/8/11.
 */
public class Test {

    public static void main(String[] args) {
        Blog blog = new BlogBKY("onlycxue");
//        std::cout << "New Blog Created" << std::endl; // 被观察者/消息发布者
        Observer observer1 = new ObserverBlog("hello",blog); // 观察者/订阅者 observer1订阅了blog
//        std::cout << "New Observer Created and observe the Blog" << std::endl;
        blog.Attach(observer1); // 被观察者将订阅者加入其订阅者列表中
//        std::cout << "Add Observer to observer list in blog" << std::endl;
        blog.SetStatus("发表博客！"); // 被观察者发布消息
//        std::cout << "Blog has new status" << std::endl;
        blog.Notify(); // 被观察者通知其订阅者列表中的所有订阅者,此时被观察者 = 消息发布者
//        std::cout << "Blog notify Observer whom is in its observer list" << std::endl;
        // system("pause");
        //delete blog;
        //delete observer1;
//        return 0;
    }
}
