package designpatterns.singleton;

/**
 * 静态内部类
 * 
 * @author liuhao
 *
 */
public class SingletonE {
	private static class SingletonHolder {
		private static final SingletonE INSTANCE = new SingletonE();
	}

	private SingletonE() {
	}

	public static final SingletonE getInstance() {
		return SingletonHolder.INSTANCE;
	}
}