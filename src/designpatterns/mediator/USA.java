package designpatterns.mediator;

public class USA extends Country {

	public USA(UnitedNations unitedNations) {
		super(unitedNations);
	}

	@Override
	public void send(String message) {
		this.unitedNations.forward(this, message);
	}

	@Override
	public void getMessage(String message) {
		System.out.println("usa收到消息："+message);
	}

}
