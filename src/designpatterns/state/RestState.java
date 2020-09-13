package designpatterns.state;

/**
 * 下班状态
 * @author liuhao
 *
 */
public class RestState implements State {

	@Override
	public void handle(Work work) {
		System.out.println("当前时间：" + work.getTime() + " 下班休息，满血复活！！！");
	}

}
