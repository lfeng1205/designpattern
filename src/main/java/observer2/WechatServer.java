package observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WechatServer extends Observable {

    private List<Observer> list;

    private String message;

    public WechatServer(){
        list = new ArrayList<>();
    }


    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        setChanged();
        //消息更新，通知所有观察者
        notifyObservers(s);
    }
}
