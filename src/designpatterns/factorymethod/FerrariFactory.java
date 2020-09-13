package designpatterns.factorymethod;

/**
 * 法拉利汽车工厂
 * @author liuhao
 *
 */
public class FerrariFactory extends CarFactory {

	@Override
	public Car produceCar() {
		return new Ferrari("法拉利");
	}

}
