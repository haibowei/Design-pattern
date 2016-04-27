package observer.subject;

import observer.ovserver.Observer;

import java.util.Vector;

/**
 * Created: haibowei
 * Date: 16/4/27.
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> observers = new Vector<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void del(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
