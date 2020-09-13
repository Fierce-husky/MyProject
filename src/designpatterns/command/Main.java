package designpatterns.command;

public class Main {

	public static void main(String[] args) {
		Chef chef = new Chef();
		DishA a = new DishA(chef);
		DishB b = new DishB(chef);
		
		Customer customer = new Customer();
		customer.addOrder(a);
		customer.addOrder(b);
		customer.execAll();
	}

}
