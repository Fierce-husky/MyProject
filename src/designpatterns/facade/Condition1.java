package designpatterns.facade;

public class Condition1 implements Lease {

	@Override
	public void condition() {
		System.out.println("光照充足");
	}

}
