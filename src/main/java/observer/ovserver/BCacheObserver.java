package observer.ovserver;

/**
 * Created: haibowei
 * Date: 16/4/27.
 */
public class BCacheObserver implements Observer {
    @Override
    public void update() {
        System.out.println("BCacheObserver is update.");
    }
}
