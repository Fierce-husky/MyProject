package designpatterns.mediator;

/**
 * 联合国
 */
public class UnitedNations {
	private Country country1;
	
	private Country country2;
	
	public Country getCountry1() {
		return country1;
	}

	public void setCountry1(Country country1) {
		this.country1 = country1;
	}

	public Country getCountry2() {
		return country2;
	}

	public void setCountry2(Country country2) {
		this.country2 = country2;
	}

	public void forward(Country country,String message) {
		if (country == country1) {
			country2.getMessage(message);
		}else {
			country1.getMessage(message);
		}
	}
}
