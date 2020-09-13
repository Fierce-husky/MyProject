package designpatterns.factorymethod;

/**
 * 客户端调用类
 * @author liuhao
 *
 */
public class Main {

	public static void main(String[] args) {
		CarFactory carFactory = new FerrariFactory();
		Car car = carFactory.produceCar();
		car.run();
		
		carFactory = new MercedesFactory();
		car = carFactory.produceCar();
		car.run();
	}

}
