package designpatterns.mediator;

public abstract class Country {
	protected UnitedNations unitedNations;

	public Country(UnitedNations unitedNations) {
		super();
		this.unitedNations = unitedNations;
	}
	
	public abstract void send(String message);
	
	public abstract void getMessage(String message);
}
