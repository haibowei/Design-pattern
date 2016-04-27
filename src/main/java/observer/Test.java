package observer;

import observer.ovserver.ACacheObserver;
import observer.ovserver.BCacheObserver;
import observer.subject.CacheSubject;
import observer.subject.Subject;

/**
 * Created: haibowei
 * Date: 16/4/27.
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new CacheSubject();
        subject.add(new ACacheObserver());
        subject.add(new BCacheObserver());

        // database is update, then notify all cache to refresh.
        subject.operation();
    }
}
