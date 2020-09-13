package designpatterns.facade;

public class Condition3 implements Lease {

	@Override
	public void condition() {
		System.out.println("价格便宜");
	}

}
