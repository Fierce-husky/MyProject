package designpatterns.observer.delegate;

/**
 * 统治者抽象类
 * @author liuhao
 *
 */
public abstract class Notifier {
    private EventHandler eventHandler = new EventHandler();
    
    public EventHandler getEventHandler()
    {
        return eventHandler;
    }
    
    public void setEventHandler(EventHandler eventHandler)
    {
        this.eventHandler = eventHandler;
    }
    
    public abstract void addListener(Object object,String methodName, Object...args);
    
    public abstract void notifyX();

}
