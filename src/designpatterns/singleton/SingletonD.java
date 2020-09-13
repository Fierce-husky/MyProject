package designpatterns.singleton;

/**
 * 双检锁
 * @author liuhao
 *
 */
public class SingletonD {  
    private volatile static SingletonD singleton;  
    private SingletonD (){}  
    public static SingletonD getSingleton() {  
    if (singleton == null) {  
        synchronized (SingletonD.class) {  
        if (singleton == null) {  
            singleton = new SingletonD();  
        }  
        }  
    }  
    return singleton;  
    }  
}
