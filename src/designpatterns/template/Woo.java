package designpatterns.template;

/**
 * 模板抽象类
 * @author liuhao
 *
 */
public abstract class Woo {
	
	/**
	 * 搭讪方法
	 */
	public abstract void tease();
	
	/**
	 * 追求
	 */
	public abstract void woo();
	
	/**
	 * 表白方法
	 */
	public abstract void confession();
	
	/**
	 * 最后执行这些步骤
	 */
	public void run() {
		tease();
		woo();
		confession();
	}
}
