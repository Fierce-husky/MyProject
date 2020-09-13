package designpatterns.bridge;

public class Main {

	public static void main(String[] args) {
		Shape redCircle = new Circle(new Red());
		redCircle.drow();
		
		Shape greenCircle = new Circle(new Green());
		greenCircle.drow();
	}

}
