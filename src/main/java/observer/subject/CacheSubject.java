package observer.subject;

/**
 * Created: haibowei
 * Date: 16/4/27.
 */
public class CacheSubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("database is update, notify all observers!");
        notifyObservers();
    }
}
