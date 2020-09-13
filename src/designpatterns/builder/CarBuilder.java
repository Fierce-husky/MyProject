package designpatterns.builder;

public class CarBuilder implements Builder {

	private Car car = new Car();
	@Override
	public void buildTire() {
		car.getCompents().add("国产轮胎");
	}

	@Override
	public void buildEngine() {
		car.getCompents().add("德国发动机");

	}

	@Override
	public Car getCar() {
		return car;
	}

}
