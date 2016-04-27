package observer.ovserver;

/**
 * Created: haibowei
 * Date: 16/4/27.
 */
public class ACacheObserver implements Observer {
    @Override
    public void update() {
        System.out.println("ACacheObserver is update.");
    }
}
