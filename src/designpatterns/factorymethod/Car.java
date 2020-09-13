package designpatterns.factorymethod;

/**
 * 抽象汽车类
 * @author liuhao
 *
 */
public abstract class Car {
	
	/**
	 * 品牌
	 */
	protected String brand;
	
	
	public Car(String brand) {
		this.brand = brand;
	}

	//开车
	public void run() {
		System.out.println("开着我的"+brand+"上路啦！");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
