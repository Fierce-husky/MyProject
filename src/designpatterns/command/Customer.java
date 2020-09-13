package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令发起者-顾客
 * @author liuhao
 *
 */
public class Customer {
	private List<Order> orders = new ArrayList<Order>();
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	public void execAll() {
		for (Order order : orders) {
			order.execute();
		}
	}
}
