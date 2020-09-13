package designpatterns.singleton;

/**
 * 懒汉式-线程安全
 * @author liuhao
 *
 */
public class SingletonB {  
    private static SingletonB instance;  
    private SingletonB (){}  
    public static synchronized SingletonB getInstance() {  
    if (instance == null) {  
        instance = new SingletonB();  
    }  
    return instance;  
    }  
}
