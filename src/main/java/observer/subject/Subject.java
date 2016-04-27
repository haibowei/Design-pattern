package observer.subject;

import observer.ovserver.Observer; /**
 * Created: haibowei
 * Date: 16/4/27.
 */

/**
 * 消息发布,当有消息变更时,通知监听者更新
 */
public interface Subject {
    /*增加观察者*/
    void add(Observer observer);

    /*删除观察者*/
    void del(Observer observer);

    /*通知所有的观察者*/
    void notifyObservers();

    /*自身的操作*/
    void operation();
}
