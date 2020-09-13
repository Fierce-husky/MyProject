package designpatterns.proxy;

/**
 * 代理类
 * @author liuhao
 *
 */
public class Friend implements Confession{
	private Boy boy;

	public Friend(Girl girl) {
		this.boy = new Boy(girl);
	}

	@Override
	public void confession() {
		boy.confession();
	}
	
}
