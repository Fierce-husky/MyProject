package designpatterns.state;

/**
 * 中午状态
 * @author liuhao
 *
 */
public class NoonState implements State {

	@Override
	public void handle(Work work) {
		if (work.getTime() < 14) {
			System.out.println("当前时间：" + work.getTime() + " 中午休息！！！");
		}else {
			System.out.println("###进入下午状态###");
			work.setState(new AfterNoonState());
		}
	}

}
