package designpatterns.observer.delegate;

import java.util.Date;

public class Test {
    
    public static void main (String[] args)
    {
        Notifier goodNotifier = new ConcreteNotifier();
        
        WatchingTVListener watchingTVListener = new WatchingTVListener();
        
        goodNotifier.addListener(watchingTVListener, "stopWatchingTV", new Date());
        
        goodNotifier.notifyX();
    }

}