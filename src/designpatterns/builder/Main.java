package designpatterns.builder;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		Builder builder = new CarBuilder();
		director.construct(builder);
		Car car = builder.getCar();
		car.show();
	}

}
