package designpatterns.singleton;

/**
 * 懒汉式-线程不安全
 * @author liuhao
 *
 */
public class SingletonA {  
    private static SingletonA instance;  
    private SingletonA (){}  
  
    public static SingletonA getInstance() {  
    if (instance == null) {  
        instance = new SingletonA();  
    }  
    return instance;  
    }  
}
