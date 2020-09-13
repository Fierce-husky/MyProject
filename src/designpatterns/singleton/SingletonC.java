package designpatterns.singleton;

/**
 * 饿汉式
 * @author liuhao
 *
 */
public class SingletonC {  
    private static SingletonC instance = new SingletonC();  
    private SingletonC (){}  
    public static SingletonC getInstance() {  
    return instance;  
    }  
}
