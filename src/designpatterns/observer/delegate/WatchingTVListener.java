package designpatterns.observer.delegate;

import java.util.Date;

/**
 * 观察者，不需要抽象
 * @author liuhao
 *
 */
public class WatchingTVListener {

    public WatchingTVListener()
    {
        System.out.println("watching TV");
    }
    
    public void stopWatchingTV(Date date) 
    {
        System.out.println("stop watching" + date);
    }
}

