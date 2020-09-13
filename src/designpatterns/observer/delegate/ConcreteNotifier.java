package designpatterns.observer.delegate;

/**
 * 通知者实现类
 * @author liuhao
 *
 */
public class ConcreteNotifier extends Notifier{

    @Override
    public void addListener(Object object, String methodName, Object... args) {
        this.getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void notifyX() {
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
