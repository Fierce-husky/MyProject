package designpatterns.facade;

/**
 * 外观类
 * @author liuhao
 *
 */
public class LeaseFade {
	private Lease condition1;
	private Lease condition2;
	private Lease condition3;
	public LeaseFade() {
		this.condition1 = new Condition1();
		this.condition2 = new Condition2();
		this.condition3 = new Condition3();
	}
	/**
	 * 外观暴露的租房方法
	 */
	public void lease() {
		condition1.condition();
		condition2.condition();
		condition3.condition();
	}
}
