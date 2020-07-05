package observer2;


import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * 实现了update方法
 *
 * @author qian
 */
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.message = (String) arg;
        read();
    }
}
