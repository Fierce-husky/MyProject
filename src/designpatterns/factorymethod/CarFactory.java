package designpatterns.factorymethod;

/**
 * 汽车工厂抽象父类
 * @author liuhao
 *
 */
public abstract class CarFactory {
	
	/**
	 * 提供生产汽车的方法
	 * @return 汽车实例
	 */
	public abstract Car produceCar();
}
