package designpatterns.factorymethod;

/**
 * 奔驰汽车工厂
 * @author liuhao
 *
 */
public class MercedesFactory extends CarFactory {

	@Override
	public Car produceCar() {
		return new Mercedes("大奔");
	}

}
