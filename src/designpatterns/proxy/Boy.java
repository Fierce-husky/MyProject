package designpatterns.proxy;

/**
 * 被代理类，相当于小伙
 * @author liuhao
 *
 */
public class Boy implements Confession {
	private Girl girl;
	
	public Boy(Girl girl) {
		this.girl = girl;
	}

	@Override
	public void confession() {
		System.out.println(girl.getName()+",i love u!");
	}

}
