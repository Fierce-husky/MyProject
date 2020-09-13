package designpatterns.mediator;

public class China extends Country {

	public China(UnitedNations unitedNations) {
		super(unitedNations);
	}
	
	public void send(String message) {
		this.unitedNations.forward(this, message);
	}
	
	public void getMessage(String message) {
		System.out.println("china收到消息："+message);
	}
}
