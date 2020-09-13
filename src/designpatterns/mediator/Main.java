package designpatterns.mediator;

public class Main {

	public static void main(String[] args) {
		
		UnitedNations unitedNations = new UnitedNations();
		China china = new China(unitedNations);
		USA usa = new USA(unitedNations);
		unitedNations.setCountry1(china);
		unitedNations.setCountry2(usa);
		
		china.send("老实点");
		usa.send("好嘞");
	}

}
